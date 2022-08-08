package com.DriveX.user_security.service.dto;

import com.DriveX.user_security.dao.entity.enums.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserReadDto {
    private UUID uuid;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String mail;
    private String nick;
    private String  role;
    private Status status;

    public UserReadDto() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public String getMail() {
        return mail;
    }

    public String getNick() {
        return nick;
    }

    public String getRole() {
        return role;
    }

    public Status getStatus() {
        return status;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setRole(String  role) {
        this.role = role;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private UUID uuid;
        private LocalDateTime dtCreate;
        private LocalDateTime dtUpdate;
        private String mail;
        private String nick;
        private String  role;
        private Status status;

        public Builder setUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }


        public Builder setNick(String nick) {
            this.nick = nick;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }


        public Builder setDtCreate(LocalDateTime dtCreate) {
            this.dtCreate = dtCreate;
            return this;
        }

        public Builder setDtUpdate(LocalDateTime dtUpdate) {
            this.dtUpdate = dtUpdate;
            return this;
        }

        public UserReadDto build() {
            UserReadDto user = new UserReadDto();

            user.setUuid(this.uuid);
            user.setDtCreate(this.dtCreate);
            user.setDtUpdate(this.dtUpdate);
            user.setMail(this.mail);
            user.setNick(this.nick);
            user.setRole(this.role);
            user.setStatus(this.status);

            return user;
        }
    }
}
