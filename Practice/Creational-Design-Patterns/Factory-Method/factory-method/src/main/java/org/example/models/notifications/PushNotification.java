package org.example.models.notifications;

import org.example.models.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String txt) {
        System.out.println("Pushing notification to user  : " + txt);
    }
}
