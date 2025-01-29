package Observer;

import Observer.Observable.IphoneObservableImpl;
import Observer.Observable.StockObservable;
import Observer.Observer.EmailAlertObserverImpl;
import Observer.Observer.MobileAlertObserverImpl;
import Observer.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver subscriber1 = new MobileAlertObserverImpl("Soham",iphoneObservable);
        NotificationAlertObserver subscriber2 = new EmailAlertObserverImpl("Soham1",iphoneObservable);
        NotificationAlertObserver subscriber3 = new MobileAlertObserverImpl("Soham2",iphoneObservable);

        StockObservable observable = new IphoneObservableImpl();
        observable.addObserver(subscriber1);
        observable.addObserver(subscriber2);
        observable.addObserver(subscriber3);

        observable.removeObserver(subscriber3);

        observable.setData(10);

    }
}
