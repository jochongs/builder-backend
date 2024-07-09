package org.example.builder.domain.emailcert;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.builder.common.email.MailerService;
import org.example.builder.domain.emailcert.dto.SendEmailCertCodeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email-cert")
@AllArgsConstructor
public class EmailCertController {

    private final MailerService mailerService;

    @PostMapping("/send")
    public void  sendEmailCertCode(
            @Valid @RequestBody SendEmailCertCodeDTO sendDto
            ) {
        mailerService.send(sendDto.getEmail(), "인증번호 입니다.", "123123");
    }
}
