package org.example.models.notifications;

import org.example.models.Notification;

public class EmailNotification  implements Notification {
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending email to user : " + text);
    }
}
