package org.example.builder.domain.user;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.builder.domain.user.dto.SignUpDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public void signUp(
            @Valid @RequestBody SignUpDTO signUpDTO
    ) {
        userService.signUp(signUpDTO);
    }
}
