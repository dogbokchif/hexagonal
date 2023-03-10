package com.example.hexagonal.application.port.in;

import com.example.hexagonal.domain.User;

public interface RegisterPort {
    void register(User user);
}
