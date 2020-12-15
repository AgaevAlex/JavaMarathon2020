package day13;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }
    public static List<String> getMessages(){
        List<String> result = new ArrayList<>();
        for (Message message : messages) {
            result.add(message.getText());
        }
        return result;
    }
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if ((message.getSender().equals(u1) && message.getReceiver().equals(u2)) || (message.getSender().equals(u2) && message.getReceiver().equals(u1))){
                System.out.println(message.getSender()+ ": " + message.getText());
            }
        }
    }
}