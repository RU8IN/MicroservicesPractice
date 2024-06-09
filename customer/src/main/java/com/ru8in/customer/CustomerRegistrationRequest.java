package com.ru8in.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}