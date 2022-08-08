package com.DriveX.user_security.service;



import com.DriveX.user_security.dao.api.UserRepository;
import com.DriveX.user_security.dao.entity.User;
import com.DriveX.user_security.dao.entity.enums.Status;
import com.DriveX.user_security.service.api.IUserService;
import com.DriveX.user_security.service.dto.LoginUserDto;
import com.DriveX.user_security.service.dto.RegistrationDto;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.core.convert.ConversionService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;

@Service
public class UserService implements IUserService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final ConversionService conversionService;

    public UserService(UserRepository repository, PasswordEncoder encoder, ConversionService conversionService) {
        this.repository = repository;
        this.encoder = encoder;
        this.conversionService = conversionService;
    }

    public RegistrationDto save(RegistrationDto dto) {
        if (repository.existsByMail(dto.getMail())) {
            throw new EntityExistsException("User already exists");
        }
        if (repository.existsByUsername(dto.getNick())){
            throw new EntityExistsException("Nick already exists");
        }
        User entity = conversionService.convert(dto, User.class);

        repository.save(entity);
        return dto;
    }

    @Override
    public User login(LoginUserDto dto) {
        User user = repository.findByMail(dto.getMail());

        if(!encoder.matches(dto.getPassword(), user.getPassword())){
            throw new IllegalArgumentException("Wrong password");
        }
        if(!user.isEnabled()){
            throw new SecurityException("Account is blocked");
        }
        if (!user.getStatus().equals(Status.ACTIVATED)) {
            throw new SecurityException("Account not activated, wait for activation");
        }
        return user;
    }

    @Override
    public UserReadDto infoForMe(String username) {
        User entity = repository.findByUsername(username);
        return conversionService.convert(entity, UserReadDto.class);
    }

}
