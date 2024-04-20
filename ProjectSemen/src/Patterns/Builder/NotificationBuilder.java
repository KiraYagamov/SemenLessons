package Patterns.Builder;

import java.util.ArrayList;

public class NotificationBuilder {
    private String title;
    private ArrayList<String> messages = new ArrayList<>();
    private String style;
    private int maxLength;

    public NotificationBuilder setTitle(String title){
        this.title = title;
        return this;
    }

    public NotificationBuilder setStyle(String style){
        this.style = style;
        return this;
    }

    public NotificationBuilder addMessage(String message){
        messages.add(message);
        if (message.length() > maxLength) maxLength = message.length();
        return this;
    }

    public NotificationBuilder clearMessages(){
        return new NotificationBuilder();
    }

    public Notification apply(){
        return new Notification(title, messages, style, maxLength);
    }
}
