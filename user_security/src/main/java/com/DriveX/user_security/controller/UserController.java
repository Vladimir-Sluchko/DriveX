package com.DriveX.user_security.controller;


import com.DriveX.user_security.controller.utils.JwtTokenUtil;
import com.DriveX.user_security.service.api.IUserService;
import com.DriveX.user_security.service.componets.UserHolder;
import com.DriveX.user_security.service.dto.LoginUserDto;
import com.DriveX.user_security.service.dto.RegistrationDto;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final IUserService service;
    private final UserHolder holder;

    public UserController(IUserService service, UserHolder holder) {
        this.service = service;
        this.holder = holder;
    }

    @PostMapping("/registration")
    public ResponseEntity<RegistrationDto> registration (@RequestBody RegistrationDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @PostMapping("/login")
    public ResponseEntity<String>  login(@RequestBody LoginUserDto dto){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION,
                JwtTokenUtil.generateAccessToken(service.login(dto)));
        return ResponseEntity.ok().headers(headers).build();
    }

    @GetMapping("/me")
    public ResponseEntity<UserReadDto>  infoForMe(){
        UserDetails user = holder.getUser();
        return ResponseEntity.ok().body(service.infoForMe(user.getUsername()));
    }

}
