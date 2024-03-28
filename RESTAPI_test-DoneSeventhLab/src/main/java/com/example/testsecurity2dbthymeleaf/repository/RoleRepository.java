package com.example.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testsecurity2dbthymeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
