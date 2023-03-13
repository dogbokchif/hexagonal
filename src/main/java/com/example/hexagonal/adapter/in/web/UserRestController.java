package com.example.hexagonal.adapter.in.web;

import com.example.hexagonal.adapter.out.persistence.user.UserComponent;
import com.example.hexagonal.adapter.out.persistence.user.UserMapper;
import com.example.hexagonal.application.port.in.CoinUpPort;
import com.example.hexagonal.application.port.in.RegisterPort;
import com.example.hexagonal.application.port.in.RenamePort;
import com.example.hexagonal.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class UserRestController {
    private final CoinUpPort coinUpPort;
    private final RenamePort renamePort;
    private final RegisterPort registerPort;

    @PostMapping("/coinup")
    void coinUp(@RequestBody User user) {
        coinUpPort.coinUp(user.getId(), 1L);
    }
    @PostMapping("/register")
    void register(@RequestBody User user) {
        registerPort.register(user);
    }
    @PostMapping("/rename")
    void rename(@RequestBody User user) {
        renamePort.rename(user.getId(), user.getName());
    }
}
