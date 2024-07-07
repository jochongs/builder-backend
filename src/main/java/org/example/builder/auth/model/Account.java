package org.example.builder.auth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.builder.user.model.User;

@Entity(name = "account_tb")
@Getter
@Setter
@ToString
public class Account {

    @Id
    @Column(name = "idx")
    private Long idx;

    @NotNull
    @Column(name = "pw", nullable = false)
    @NotNull
    private String pw;

    @OneToOne
    @JoinColumn(name = "idx", referencedColumnName = "idx", insertable = false, updatable = false)
    User user;
}
