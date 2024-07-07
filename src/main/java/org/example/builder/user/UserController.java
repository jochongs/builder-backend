package org.example.builder.user;

import jakarta.validation.Valid;
import org.example.builder.user.dto.SignUpDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public void signUp(
            @Valid @RequestBody SignUpDTO signUpDTO
    ) {
        return;
    }
}
