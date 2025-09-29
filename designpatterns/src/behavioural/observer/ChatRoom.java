package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Subject {
    private List<Observer> users = new ArrayList<>();

    public void addObserver(Observer observer) {
        users.add(observer);
    }

    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer user : users) {
            user.update(message);
        }
    }
}
