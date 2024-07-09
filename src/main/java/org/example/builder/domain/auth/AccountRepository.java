package org.example.builder.domain.auth;

import org.example.builder.domain.auth.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {}
