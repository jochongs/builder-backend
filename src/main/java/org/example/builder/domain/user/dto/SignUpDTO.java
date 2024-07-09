package org.example.builder.user.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpDTO {

    @NotNull(message = "이름을 필수값입니다.")
    @NotEmpty
    @Size(min = 2, max = 8, message = "이름은 2~8글자 사이여야합니다.")
    private String name;

    @NotNull(message = "이메일은 필수값입니다.")
    @NotEmpty
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotNull(message = "비밀번호는 필수값입니다.")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,18}$")
    private String pw;
}
