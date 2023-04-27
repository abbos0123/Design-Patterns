package org.example;

import org.example.models.Notification;
import org.example.factory.NotificationFactory;
import org.example.service.Service;

public class Application {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notificationSms = factory.createNotification("SMS");
        Notification notificationEmail = factory.createNotification("EMAIL");
        Notification notificationPhone = factory.createNotification("PHONE");
        Service service = new Service();

        System.out.println("--------------Sms--------------------------------------\n");
        service.setNotification(notificationSms);
        service.congratulations();
        service.notifyUsersAboutTsunami();

        System.out.println("\n\n--------------Email--------------------------------\n");
        service.setNotification(notificationEmail);
        service.congratulations();
        service.notifyUsersAboutTsunami();

        System.out.println("\n\n--------------Phone---------------------------------\n");
        service.setNotification(notificationPhone);
        service.congratulations();
        service.notifyUsersAboutTsunami();

    }
}