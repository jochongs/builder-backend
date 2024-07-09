package org.example.builder.email.emailcert.dto;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.example.builder.email.emailcert.EmailCertType;

@Data
public class SendEmailCertCodeDTO {
    private EmailCertType type;

    @Email
    private String email;
}
