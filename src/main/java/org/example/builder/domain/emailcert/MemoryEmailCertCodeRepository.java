package org.example.builder.domain.emailcert;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryEmailCertCodeRepository implements EmailCertCodeRepository {

    private final Map<String, String> certCodeMap = new ConcurrentHashMap<>();

    @Override
    public Optional<String> get(String key) {
        return Optional.ofNullable(certCodeMap.get(key));
    }

    @Override
    public void set(String key, String value) {
        certCodeMap.put(key, value);
        removeElementAfter3Min(key);
    }

    private void removeElementAfter3Min(String key) {
        new Thread(() -> {
            try {
                Thread.sleep(1000 * 60 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            certCodeMap.remove(key);
        });
    }
}
