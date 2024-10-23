package com.my.login.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(nullable = false, unique = true)
    private String user_email;

    @Column(nullable = false)
    private String user_password;

    @Column(nullable = false)
    private String user_name;

    @Column(unique = true)
    private String user_phone;

    @Column
    private String user_address;

    @Column
    private String user_membership;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole user_role;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime user_create_at;

    @LastModifiedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime user_update_at;
}
