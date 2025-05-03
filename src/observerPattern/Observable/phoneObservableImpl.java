package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;

public class phoneObservableImpl implements StockObservable{
    public ArrayList<NotificationAlertObserver> list = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver obj) {
        list.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        list.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver i: list) {
            i.update();
        }
    }

    public void setStockCount(int newStockAdded) {
        stockCount += newStockAdded;
        notifyObservers();
    }

    public int getStockCount() {
        return stockCount;
    }
}
