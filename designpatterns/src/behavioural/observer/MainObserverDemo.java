package behavioural.observer;

public class MainObserverDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        User alice = new User("Alice");
        User bob = new User("Bob");

        room.addObserver(alice);
        room.addObserver(bob);

        room.notifyObservers("Hello everyone!");
    }
}
