package com.example.hexagonal.domain;

import lombok.Builder;

public class User {
    private Long id;
    private String name;
    private Long coin;

    @Builder
    public User(Long id, String name, Long coin) {
        this.id = id;
        this.name = name;
        this.coin = coin;
    }

    public void coinUp(Long coin) {
        this.coin = this.coin + coin;
    }
    public void rename(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Long getCoin() {
        return coin;
    }
}
