package com.example.hexagonal.adapter.out.persistence.user;

import com.example.hexagonal.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public User toDomain(UserEntity entity) {
        return User.builder()
                .id(entity.getId())
                .name(entity.getName())
                .coin(entity.getCoin())
                .build();
    }

    public UserEntity toEntity(User domain) {
        return UserEntity.builder()
                .id(domain.getId())
                .name(domain.getName())
                .coin(domain.getCoin())
                .build();
    }
}
