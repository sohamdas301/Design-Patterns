package Observer.Observer;

import Observer.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String userName;
    private StockObservable stockObservable;
    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("SMS sent to " + userName);
    }
}
