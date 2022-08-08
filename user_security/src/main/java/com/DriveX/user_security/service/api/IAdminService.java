package com.DriveX.user_security.service.api;

import com.DriveX.user_security.service.dto.CreatUserDto;
import com.DriveX.user_security.service.dto.PageDto;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.UUID;
@Validated
public interface IAdminService {

    CreatUserDto create(@Valid CreatUserDto dto);

    PageDto<UserReadDto> getAll(int page, int size);

    UserReadDto get(UUID uuid);

    CreatUserDto update (@Valid CreatUserDto dto, UUID uuid, Long dtUpdate);

}
