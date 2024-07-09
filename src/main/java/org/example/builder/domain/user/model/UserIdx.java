package org.example.builder.domain.user.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UserIdx implements Serializable {
    int userIdx;
}
