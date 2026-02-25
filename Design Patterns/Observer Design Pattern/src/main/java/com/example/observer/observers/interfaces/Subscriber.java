package com.example.observer.observers.interfaces;

import com.example.observer.observable.interfaces.Channel;

public interface Subscriber {

    void fetchLatestVideo(String name);
    void subscribe(Channel channel);
    void unSubscribe(Channel channel);

}
