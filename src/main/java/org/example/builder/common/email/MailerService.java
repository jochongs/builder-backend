package org.example.builder.common.email;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailerService {

    private final JavaMailSender mailer;

    public void send(String toEmail, String title, String content) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("shoot151511@gmail.com");
        message.setTo(toEmail);
        message.setSubject("인증코드입니다.");
        message.setText("123123");
        mailer.send(message);
    }
}
