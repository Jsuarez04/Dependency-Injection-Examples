package Notifications.example;

public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
