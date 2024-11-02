package com.lpnu.bus.repository;

import com.lpnu.bus.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> dtoList = new ArrayList<>();
    private static long ID = 1;

    public User getUserById(long id) {
        return dtoList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));
    }

    public List<User> getUsers() {
        return dtoList;
    }

    public User save(User user) {
        user.setId(ID);
        dtoList.add(user);

        ++ID;

        return user;
    }

    public User updateUser(User userDTO) {
        User user = dtoList.stream()
                .filter(e -> e.getId() == userDTO.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));

        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());

        return user;
    }

    public void deleteById(long id) {
        dtoList.removeIf(e -> e.getId() == id);
    }
}
