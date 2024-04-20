package Patterns.Builder;

import java.util.ArrayList;

public class TestNotify {
    public static void main(String[] args) {
        ArrayList<Notification> notifications = new ArrayList<>();

        NotificationBuilder builder = new NotificationBuilder();

        builder = new NotificationBuilder().setTitle("Semen")
                .setStyle("-")
                .addMessage("Hello world!");

        notifications.add(builder.apply());

        builder = new NotificationBuilder().setTitle("Kira")
                .setStyle("-")
                .addMessage("Hello1");
        notifications.add(builder.apply());

        for (Notification notify : notifications) {
            notify.display();
        }
    }
}
