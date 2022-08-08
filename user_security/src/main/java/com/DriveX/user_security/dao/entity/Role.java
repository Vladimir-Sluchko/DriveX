package com.DriveX.user_security.dao.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "roles", schema = "security")
public class Role implements GrantedAuthority {

    private UUID uuid;
    private String roleName;

    public Role() {
    }

    public Role(UUID uuid, String roleName) {
        this.uuid = uuid;
        this.roleName = roleName;
    }

    @Id
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setAuthority(String roleName) {
        this.roleName = roleName;
    }

    @Override
    @Column(name = "role_name", nullable = false)
    public String getAuthority() {
        return roleName;
    }

}
