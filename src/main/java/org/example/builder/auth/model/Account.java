package org.example.builder.auth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.builder.user.model.User;

@Entity(name = "account_tb")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @Column(name = "idx")
    private Long idx;

    @NotNull
    @Column(name = "pw", nullable = false)
    private String pw;

    @OneToOne
    @JoinColumn(name = "idx", referencedColumnName = "idx", insertable = false, updatable = false)
    User user;

    @Builder
    public Account(String pw, User user) {
        this.pw = pw;
        this.user = user;
    }
}
