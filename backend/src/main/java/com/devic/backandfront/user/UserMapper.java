package com.devic.backandfront.user;

import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getEmail());
        return userDTO;
    }

    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.id());
        user.setUsername(userDTO.username());
        user.setPassword(userDTO.password());
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        return user;
    }
}
