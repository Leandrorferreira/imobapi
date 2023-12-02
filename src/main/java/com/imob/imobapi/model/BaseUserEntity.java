package com.imob.imobapi.model;

import com.imob.imobapi.model.enums.UserStatus;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public abstract class BaseUserEntity {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phoneNumber;

    @Column(nullable = false)
    private UserStatus status;
}
