package com.DriveX.user_security.dao.api;

import com.DriveX.user_security.dao.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Role findByAuthority(String roleName);
}
