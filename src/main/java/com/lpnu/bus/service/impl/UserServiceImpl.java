package com.lpnu.bus.service.impl;

import com.lpnu.bus.dto.UserDTO;
import com.lpnu.bus.entity.User;
import com.lpnu.bus.repository.UserRepository;
import com.lpnu.bus.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.getUserById(id);
        return UserDTO.fromUser(user);
    }

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.getUsers().stream()
                .map(UserDTO::fromUser)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO createUser(final UserDTO userDTO) {
        final User user = new User();

        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setEmail(user.getEmail());

        userRepository.save(user);

        return UserDTO.fromUser(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        User user = userRepository.getUserById(userDTO.getId());

        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setEmail(user.getEmail());

        userRepository.save(user);

        return UserDTO.fromUser(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
