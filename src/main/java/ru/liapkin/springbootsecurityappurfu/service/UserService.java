package ru.liapkin.springbootsecurityappurfu.service;

import org.springframework.stereotype.Service;
import ru.liapkin.springbootsecurityappurfu.dto.UserDto;
import ru.liapkin.springbootsecurityappurfu.entity.User;

import java.util.List;

@Service
public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
