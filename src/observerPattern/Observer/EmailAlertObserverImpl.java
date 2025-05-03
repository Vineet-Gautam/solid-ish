package observerPattern.Observer;

import observerPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private String email;
    private StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email, "Product is back in stock!");
    }

    private void sendEmail(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}