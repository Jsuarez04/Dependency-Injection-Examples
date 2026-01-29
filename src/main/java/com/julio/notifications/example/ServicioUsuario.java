package com.julio.notifications.example;

public class ServicioUsuario {
private NotificationService notificationService;
    public ServicioUsuario(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotification(String message){
        notificationService.sendNotification(message);
    }

}
