package com.DriveX.user_security.service.dto;

import com.DriveX.user_security.dao.entity.enums.Status;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreatUserDto {
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$",message = "Invalid e-mail address")
    private String mail;
    @Size(min = 2, max = 20,message = "Invalid nick")
    private String nick;
    @NotBlank(message = "Enter role")
    private String role;
    @NotNull(message = "Enter status")
    private Status status;
    @NotBlank(message = "Enter password")
    private String password;

    public CreatUserDto() {
    }

    public String getMail() {
        return mail;
    }

    public String getNick() {
        return nick;
    }

    public String  getRole() {
        return role;
    }

    public Status getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }


}
