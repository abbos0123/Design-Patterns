package org.example.service;

import org.example.models.Notification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Service {

    private Notification notification;
    public void notifyUsersAboutTsunami(){
        String message ="Please, be careful, there would be tsunami at 09.03.2023.";
        notification.notifyUser(message);
    }

    public void congratulations(){
        String  message = "congratulations! Happy birthday";
        notification.notifyUser(message);
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
