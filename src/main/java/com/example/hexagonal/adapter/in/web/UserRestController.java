package com.example.hexagonal.adapter.in.web;

import com.example.hexagonal.application.port.in.CoinUpPort;
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

    @PostMapping("/rename")
    void rename(@RequestBody User user) {

    }
}
