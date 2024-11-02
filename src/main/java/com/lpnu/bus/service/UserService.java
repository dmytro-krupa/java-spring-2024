package com.lpnu.bus.service;

import com.lpnu.bus.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserById(Long id);

    List<UserDTO> getUsers();

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO);

    void deleteById(Long id);
}
