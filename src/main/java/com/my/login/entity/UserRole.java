package com.my.login.entity;

import jakarta.persistence.EnumType;
import lombok.Getter;

@Getter
public enum UserRole{
    ADMIN,
    USER
}
