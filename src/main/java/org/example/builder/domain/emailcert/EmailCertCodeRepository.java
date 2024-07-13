package org.example.builder.domain.emailcert;

import java.util.Optional;

public interface EmailCertCodeRepository {

    Optional<String> get(String key);

    void set(String key, String value);
}
