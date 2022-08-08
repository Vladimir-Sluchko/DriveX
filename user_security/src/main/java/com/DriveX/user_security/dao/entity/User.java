package com.DriveX.user_security.dao.entity;

import com.DriveX.user_security.dao.entity.enums.Status;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users", schema = "security")
public class User implements UserDetails {

    private UUID uuid;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String mail;
    private String username;
    private Set<Role> roles;
    private Status status;
    private String password;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    public User() {
    }

    @Id
    @Column(name = "uuid", nullable = false, updatable = false, unique = true)
    public UUID getUuid() {
        return uuid;
    }

    @Column(name = "dt_create")
    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    @Column(name = "dt_update")
    @Version
    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    @Column(name = "mail",nullable = false, unique = true)
    public String getMail() {
        return mail;
    }


    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    public Status getStatus() {
        return status;
    }

    @Override
    @Column(name = "roles")
    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_uuid"),
            inverseJoinColumns = @JoinColumn(name = "role_uuid"))
    public Set<Role> getAuthorities() {
        return roles;
    }

    @Override
    @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    @Override
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAuthorities(Set<Role> roles) {
        this.roles = roles;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private UUID uuid;
        private LocalDateTime dtCreate;
        private LocalDateTime dtUpdate;
        private String mail;
        private String username;
        private Set<Role> roles;
        private Status status;
        private String password;
        private boolean accountNonExpired;
        private boolean accountNonLocked;
        private boolean credentialsNonExpired;
        private boolean enabled;

        public Builder setUuid(UUID uuid) {
            this.uuid = uuid;
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

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }
        public Builder setAuthorities(Set<Role> roles) {
            this.roles = roles;
            return this;
        }
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAccountNonExpired(boolean accountNonExpired) {
            this.accountNonExpired = accountNonExpired;
            return this;
        }

        public Builder setAccountNonLocked(boolean accountNonLocked) {
            this.accountNonLocked = accountNonLocked;
            return this;
        }

        public Builder setCredentialsNonExpired(boolean credentialsNonExpired) {
            this.credentialsNonExpired = credentialsNonExpired;
            return this;
        }

        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public User build() {
            User user = new User();

            user.setUuid(this.uuid);
            user.setDtCreate(this.dtCreate);
            user.setDtUpdate(this.dtUpdate);
            user.setMail(this.mail);
            user.setUsername(this.username);
            user.setAuthorities(this.roles);
            user.setStatus(this.status);
            user.setPassword(this.password);
            user.setAccountNonExpired(this.accountNonExpired);
            user.setAccountNonLocked(this.accountNonLocked);
            user.setCredentialsNonExpired(this.credentialsNonExpired);
            user.setEnabled(this.enabled);

            return user;
        }
    }
}
