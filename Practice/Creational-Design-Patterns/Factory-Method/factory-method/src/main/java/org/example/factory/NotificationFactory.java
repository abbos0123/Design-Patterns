package org.example.factory;

import org.example.models.Notification;
import org.example.models.notifications.EmailNotification;
import org.example.models.notifications.PhoneNotification;
import org.example.models.notifications.PushNotification;
import org.example.models.notifications.SmsNotification;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SmsNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            case "PHONE":
                return new PhoneNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
