package Observer.Observable;

import Observer.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addObserver(NotificationAlertObserver notificationAlertObserver);

    public void removeObserver(NotificationAlertObserver notificationAlertObserver);

    public void notifyObserver();

    public void setData(int productQuantity);
}
