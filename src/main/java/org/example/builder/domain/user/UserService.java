package org.example.builder.domain.user;

import lombok.AllArgsConstructor;
import org.example.builder.domain.auth.AccountRepository;
import org.example.builder.domain.auth.model.Account;
import org.example.builder.domain.user.model.User;
import org.example.builder.common.email.MailerService;
import org.example.builder.domain.user.dto.SignUpDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private final AccountRepository accountRepository;
    private final MailerService mailerService;

    @Transactional
    public void signUp(SignUpDTO signUpDto) {
        mailerService.send("joch2712@naver.com", "테스트입니다.", "네 안녕하세요");

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
