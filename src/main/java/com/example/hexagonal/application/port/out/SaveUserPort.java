package com.example.hexagonal.application.port.out;

import com.example.hexagonal.domain.User;

public interface SaveUserPort {
    User save(User user);
    User register(User user);
}
