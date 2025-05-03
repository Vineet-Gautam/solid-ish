package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifyObservers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
