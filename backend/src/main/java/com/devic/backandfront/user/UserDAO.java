package com.devic.backandfront.user;

import java.util.Optional;

public interface UserDAO {
    Optional<User> findById(Long id);
    void save(User user);
    void deleteById(Long userId);
    void update(User update);
}
