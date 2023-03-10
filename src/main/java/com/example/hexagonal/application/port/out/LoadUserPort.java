package com.example.hexagonal.application.port.out;

import com.example.hexagonal.domain.User;

public interface LoadUserPort {
    User load(Long id);
}
