package com.julio.notifications.example;

public class WhatsAppNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando WhatsApp: " + message);
    }
}
