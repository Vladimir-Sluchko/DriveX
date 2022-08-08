package com.DriveX.user_security.service.api;

import com.DriveX.user_security.dao.entity.User;
import com.DriveX.user_security.service.dto.LoginUserDto;
import com.DriveX.user_security.service.dto.RegistrationDto;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
public interface IUserService {
    RegistrationDto save (@Valid RegistrationDto dto);
    User login(@Valid LoginUserDto dto);
    UserReadDto infoForMe(String mail);
}
