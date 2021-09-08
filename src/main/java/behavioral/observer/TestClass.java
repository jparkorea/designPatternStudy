package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TestClass implements Observable{

    List<Observer> observerList = new ArrayList<>();
    private boolean newContents;

    public boolean isNewContents(){
        return newContents;
    }

    public void release(){
        System.out.println("New Contents Registered");
        newContents = true;
        email();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void cancel(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void email() {
        observerList.forEach(Observer::update);
    }
}
