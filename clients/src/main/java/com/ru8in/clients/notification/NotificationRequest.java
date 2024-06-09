package com.ru8in.clients.notification;

public record NotificationRequest(
    Integer customerId,
    String customerEmail,
    String message
) {}
