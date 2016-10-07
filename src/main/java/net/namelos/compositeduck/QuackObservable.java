package net.namelos.compositeduck;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
