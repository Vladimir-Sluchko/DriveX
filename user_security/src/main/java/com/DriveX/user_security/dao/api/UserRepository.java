package com.DriveX.user_security.dao.api;

import com.DriveX.user_security.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByMail(String mail);
    User findByUsername(String name);

    boolean existsByMail(String mail);
    boolean existsByUsername(String nick);
}
