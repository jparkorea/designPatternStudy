package behavioral.observer;

public interface Observable {
    void subscribe(Observer observer);

    void cancel(Observer observer);

    void email();
}
