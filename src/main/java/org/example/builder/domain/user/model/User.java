package org.example.builder.domain.user.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity(name = "user_tb")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private Integer idx;

    @NotNull
    @Column(name = "name", nullable = false)
    @Size(min = 2, max = 8)
    private String name;

    @NotNull
    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Builder
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
