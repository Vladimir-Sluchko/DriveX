package com.DriveX.user_security.service.converter;

import com.DriveX.user_security.dao.api.RoleRepository;
import com.DriveX.user_security.dao.entity.Role;
import com.DriveX.user_security.dao.entity.User;
import com.DriveX.user_security.dao.entity.enums.Status;
import com.DriveX.user_security.service.dto.RegistrationDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class RegistrationDtoToUserEntity implements Converter<RegistrationDto, User> {
    private final PasswordEncoder encoder;
    private final RoleRepository repository;

    public RegistrationDtoToUserEntity(PasswordEncoder encoder, RoleRepository repository) {
        this.encoder = encoder;
        this.repository = repository;
    }

    @Override
    public User convert(RegistrationDto source) {
        Set<Role> roles = new HashSet<>();
        roles.add(repository.findByAuthority("USER"));
        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS);
        return User.builder()
                .setUuid(UUID.randomUUID())
                .setUsername(source.getNick())
                .setMail(source.getMail())
                .setPassword(encoder.encode(source.getPassword()))
                .setStatus(Status.ACTIVATED)
                .setAuthorities(roles)
                .setDtCreate(localDateTime)
                .setDtUpdate(localDateTime)
                .setAccountNonLocked(true)
                .setAccountNonExpired(true)
                .setCredentialsNonExpired(true)
                .setEnabled(true)
                .build();
    }
}
