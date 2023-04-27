package org.example.models.notifications;

import org.example.models.Notification;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser(String txt) {
        System.out.println("Sending sms to user  : " + txt);
    }
}
