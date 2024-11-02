package com.lpnu.bus.repository;

import com.lpnu.bus.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> entityList = new ArrayList<>();
    private static Long ID = 1L;

    public User getUserById(long id) {
        return entityList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));
    }

    public List<User> getUsers() {
        return entityList;
    }

    public User save(User user) {
        user.setId(ID);
        entityList.add(user);

        ++ID;

        return user;
    }

    public User updateUser(User updatedUser) {
        User user = entityList.stream()
                .filter(e -> e.getId() == updatedUser.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("User not found"));

        user.setName(updatedUser.getName());
        user.setSurname(updatedUser.getSurname());

        return user;
    }

    public void deleteById(long id) {
        entityList.removeIf(e -> e.getId() == id);
    }
}
