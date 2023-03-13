package com.example.hexagonal.application.port.out;

import com.example.hexagonal.adapter.out.persistence.user.UserEntity;
import com.example.hexagonal.domain.User;

public interface SaveUserPort {
    void save(User user);
    void register(User user);
}
