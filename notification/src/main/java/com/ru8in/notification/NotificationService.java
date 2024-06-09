package com.ru8in.notification;


import com.ru8in.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .id(notificationRequest.customerId())
                        .toCustomerEmail(notificationRequest.customerEmail())
                        .sender("Amigos")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }

}
