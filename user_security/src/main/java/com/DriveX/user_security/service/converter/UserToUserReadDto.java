package com.DriveX.user_security.service.converter;

import com.DriveX.user_security.dao.entity.User;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserToUserReadDto implements Converter<User, UserReadDto> {

    @Override
    public UserReadDto convert(User source) {
        String roleStr = source.getAuthorities().stream()
                .map(s -> s.getAuthority())
                .collect(Collectors.joining(", "));

        return UserReadDto.builder()
                .setUuid(source.getUuid())
                .setDtCreate(source.getDtCreate())
                .setDtUpdate(source.getDtUpdate())
                .setMail(source.getMail())
                .setNick(source.getUsername())
                .setRole(roleStr)
                .setStatus(source.getStatus())
                .build();
    }
}
