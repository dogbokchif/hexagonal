package com.example.hexagonal.application.service;

import com.example.hexagonal.application.port.in.CoinUpPort;
import com.example.hexagonal.application.port.in.RegisterPort;
import com.example.hexagonal.application.port.in.RenamePort;
import com.example.hexagonal.application.port.out.LoadUserPort;
import com.example.hexagonal.application.port.out.SaveUserPort;
import com.example.hexagonal.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements CoinUpPort, RenamePort, RegisterPort {
    private final SaveUserPort saveUserPort;
    private final LoadUserPort loadUserPort;

    @Override
    public void coinUp(Long id, Long coin) {
        User user = loadUserPort.load(id);

        user.coinUp(coin);

        saveUserPort.save(user);
    }
    @Override
    public void rename(Long id, String name) {
        User user = loadUserPort.load(id);

        user.rename(name);

        saveUserPort.save(user);
    }
    @Override
    public void register(User user) {
        saveUserPort.register(user);
    }
}
