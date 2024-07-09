package org.example.builder.domain.auth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.builder.domain.user.model.User;

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
