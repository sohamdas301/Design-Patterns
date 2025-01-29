package Observer.Observable;

import Observer.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    List<NotificationAlertObserver> listOfObservers = new ArrayList<>();
    int productQuantity;
    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        listOfObservers.add(notificationAlertObserver);
    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        listOfObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver notificationAlertObserver : listOfObservers) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setData(int productQuantity) {
        if(this.productQuantity == 0) notifyObserver();
        this.productQuantity += productQuantity;
    }
}
