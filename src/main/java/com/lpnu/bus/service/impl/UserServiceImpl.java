package com.lpnu.bus.service.impl;

import com.lpnu.bus.dto.UserDTO;
import com.lpnu.bus.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<UserDTO> dtoList = new ArrayList<>();
    private static long ID = 1;

    @Override
    public UserDTO getUserById(long id) {
        return dtoList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));
    }

    @Override
    public List<UserDTO> getUsers() {
        return dtoList;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        userDTO.setId(ID);
        dtoList.add(userDTO);

        ++ID;

        return userDTO;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        UserDTO user = dtoList.stream()
                .filter(e -> e.getId() == userDTO.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));

        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());

        return user;
    }

    @Override
    public void deleteById(long id) {
        dtoList.removeIf(e -> e.getId() == id);
    }
}
