package com.lpnu.bus.dto;

import com.lpnu.bus.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long id;
    private String name;
    private String surname;
    private String email;

    public static UserDTO fromUser(User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(userDTO.getName());
        userDTO.setSurname(userDTO.getSurname());
        userDTO.setEmail(userDTO.getEmail());

        return userDTO;
    }
}
