package com.julio.notifications.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailNotification implements NotificationService {
    private String email;

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando email: " + message + " a " + email);
    }
}
