package org.example.builder.email.emailcert;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.builder.email.MailerService;
import org.example.builder.email.emailcert.dto.SendEmailCertCodeDTO;
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

    }
}
