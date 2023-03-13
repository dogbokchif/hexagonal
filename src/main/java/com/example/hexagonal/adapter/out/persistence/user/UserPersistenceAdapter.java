package com.example.hexagonal.adapter.out.persistence.user;

import com.example.hexagonal.application.port.out.LoadUserPort;
import com.example.hexagonal.application.port.out.SaveUserPort;
import com.example.hexagonal.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserPersistenceAdapter
        implements LoadUserPort, SaveUserPort {

    private final UserMapper userMapper;
    private final UserComponent userComponent;

    @Override
    public User load(Long id) {
        UserEntity user = userMapper.load(id);

        return userComponent.toDomain(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(userComponent.toEntity(user));
    }
    @Override
    public void register(User user) {
        System.out.println(user.getName());
        userMapper.register(userComponent.toEntity(user));
    }
}