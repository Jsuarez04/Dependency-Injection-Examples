package com.julio.notifications.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ServicioUsuario {
private NotificationService notificationService;

    public void sendNotification(String message){
        notificationService.sendNotification(message);
    }

}
