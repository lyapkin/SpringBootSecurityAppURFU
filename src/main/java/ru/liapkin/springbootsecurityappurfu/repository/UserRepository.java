package ru.liapkin.springbootsecurityappurfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liapkin.springbootsecurityappurfu.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
