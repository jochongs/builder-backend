package org.example.builder.domain.emailcert.dto;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.example.builder.common.annotation.Enum;
import org.example.builder.domain.emailcert.EmailCertType;

@Data
public class SendEmailCertCodeDTO {
    @Enum(target = EmailCertType.class)
    private EmailCertType type;

    @Email
    private String email;
}
