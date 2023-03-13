package com.example.hexagonal.adapter.out.persistence.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
public interface UserMapper {
    /**
     * 유저 불러오기
     */
    public UserEntity load(Long id);
    /**
     * 유저 저장하기
     */
    public void save(UserEntity user);
    /**
     * 유저 생성하기
     */
    public void register(UserEntity user);
}