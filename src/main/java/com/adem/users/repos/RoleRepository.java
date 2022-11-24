package com.adem.users.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.adem.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}