package ru.liapkin.springbootsecurityappurfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liapkin.springbootsecurityappurfu.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
