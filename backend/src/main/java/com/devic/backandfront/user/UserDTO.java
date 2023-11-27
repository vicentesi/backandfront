package com.devic.backandfront.user;

public record UserDTO(
    Long id,
    String username,
    String password,
    String name,
    String email) {
}
