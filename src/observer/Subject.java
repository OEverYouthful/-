package observer;

import observer.Observer;

/**
 * 该接口相当于天气台管理者，谁想接入我和离开我都必须通过它去管理
 * */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifObserver();
}
