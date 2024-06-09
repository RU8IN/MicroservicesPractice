package com.ru8in.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Random;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();

        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(randomBoolean)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return randomBoolean;
    }
}
