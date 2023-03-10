package com.example.hexagonal.adapter.out.persistence.user;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nonnull
    @Column(columnDefinition = "VARCHAR(40) NOT NULL")
    private String name;
    @Nonnull
    @Column(columnDefinition = "INT(11) NOT NULL")
    private Long coin;
}