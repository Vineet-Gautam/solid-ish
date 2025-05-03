package observerPattern;

import observerPattern.Observable.StockObservable;
import observerPattern.Observable.phoneObservableImpl;
import observerPattern.Observer.EmailAlertObserverImpl;
import observerPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable phoneStock = new phoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("user1@mail.com", phoneStock);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("user2@mail.com", phoneStock);

        phoneStock.add(observer1);
        phoneStock.add(observer2);

        System.out.println("Adding stock of 10 phones...");
        phoneStock.setStockCount(10);
    }
}
