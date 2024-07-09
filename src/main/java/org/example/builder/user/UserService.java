package org.example.builder.user;

import lombok.AllArgsConstructor;
import org.example.builder.auth.AccountRepository;
import org.example.builder.auth.model.Account;
import org.example.builder.user.dto.SignUpDTO;
import org.example.builder.user.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private final AccountRepository accountRepository;

    @Transactional
    public void signUp(SignUpDTO signUpDto) {
        User user = User.builder()
                .name(signUpDto.getName())
                .email(signUpDto.getEmail())
                .build();

        Account account = Account.builder()
                .pw(signUpDto.getPw())
                .user(user)
                .build();

        accountRepository.save(account);
    }
}
