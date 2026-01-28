package Notifications.example;

public class NotificationCenter {
    public static void main(String[] args) {
        ServicioUsuario correo = new ServicioUsuario(new EmailNotification("julio@julio.com"));
        ServicioUsuario whatsapp = new ServicioUsuario(new WhatsAppNotification());

        correo.sendNotification("Hello World");
        whatsapp.sendNotification("Hello World");
    }
}
