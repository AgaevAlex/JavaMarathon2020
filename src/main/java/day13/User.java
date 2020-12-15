package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;
    private boolean isFriend = false;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }


    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        if (subscriptions.contains(user) && user.getSubscriptions().contains(this)) {
            isFriend = true;
        }
        return isFriend;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
