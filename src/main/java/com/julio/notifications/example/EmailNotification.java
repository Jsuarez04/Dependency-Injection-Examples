package com.julio.notifications.example;

public class EmailNotification implements NotificationService {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando email: " + message + " a " + email);
    }
}
