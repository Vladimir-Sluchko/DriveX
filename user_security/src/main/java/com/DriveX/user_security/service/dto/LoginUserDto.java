package com.DriveX.user_security.service.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginUserDto {
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$",message = "Invalid e-mail address")
    private String mail;
    @NotBlank(message = "Enter password")
    private String password;

    public LoginUserDto() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
