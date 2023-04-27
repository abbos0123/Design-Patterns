package org.example.models.notifications;

import org.example.models.Notification;

public class PhoneNotification implements Notification {
    @Override
    public void notifyUser(String txt) {
        System.out.println("Phoning to user : " + txt);
    }
}
