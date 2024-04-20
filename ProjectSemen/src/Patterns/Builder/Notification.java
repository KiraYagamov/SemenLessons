package Patterns.Builder;

import java.util.ArrayList;

public class Notification {
    private String title;
    private ArrayList<String> messages;
    private String style;
    private int maxLength;

    public Notification(String title, ArrayList<String> messages, String style, int maxLength){
        this.title = title;
        this.messages = messages;
        this.style = style;
        this.maxLength = maxLength;
    }

    public void display(){
        String ram = "";
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(title);
        for(int i = 0; i < maxLength + 5; i++) ram += style;
        System.out.println(ram);
        for (String msg : messages) {
            System.out.println(Utils.getFullJustifiedString(style + " " + msg + " " + style, maxLength + 5));
        }
        System.out.println(ram);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
}
