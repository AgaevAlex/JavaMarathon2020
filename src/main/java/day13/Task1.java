package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Alex");
        User user2 = new User("Anton");
        User user3 = new User("Neznakomec");

        MessageDatabase.addNewMessage(user1, user2, "Privet, Anton");
        MessageDatabase.addNewMessage(user1, user2, "Kak dela?");

        MessageDatabase.addNewMessage(user2, user1, "Privet, Alex");
        MessageDatabase.addNewMessage(user2, user1, "Otli4no, ti kak ?");
        MessageDatabase.addNewMessage(user2, user1, "Устал придумывать");

        MessageDatabase.addNewMessage(user3, user1, "Privet, Alex");
        MessageDatabase.addNewMessage(user3, user1, "Ne videlis 100 let");
        MessageDatabase.addNewMessage(user3, user1, "Kak dela ?");

        MessageDatabase.addNewMessage(user1, user3, "Privet, neznakomec");
        MessageDatabase.addNewMessage(user1, user3, "vse otli4no");
        MessageDatabase.addNewMessage(user1, user3, "Poka");

        MessageDatabase.addNewMessage(user3, user1, "Poka");

        MessageDatabase.showDialog(user1,user3);


    }
}
