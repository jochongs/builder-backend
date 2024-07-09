package org.example.builder.auth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.builder.user.model.User;
import org.example.builder.user.model.UserIdx;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity(name = "account_tb")
public class Account {

    @Id
    private Integer idx;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idx", referencedColumnName = "idx")
    private User user;

    @NotNull
    @Column(name = "pw", nullable = false)
    private String pw;

    @Builder
    public Account(String pw, User user) {
        this.pw = pw;
        this.user = user;
    }
}
