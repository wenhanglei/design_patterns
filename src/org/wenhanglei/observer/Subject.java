package org.wenhanglei.observer;

public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有注册的观察者
     */
    void notifyObserver();

}
