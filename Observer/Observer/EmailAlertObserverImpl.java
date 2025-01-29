package Observer.Observer;

import Observer.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private final String userName;
    private final StockObservable stockObservable;
    public EmailAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Email sent to " + userName);
    }
}
