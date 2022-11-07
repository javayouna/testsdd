package com.eoe.jds.userrole;

import lombok.Getter;

@Getter
public enum UserRole {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}