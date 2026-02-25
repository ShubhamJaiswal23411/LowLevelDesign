package com.example.observer.observable.interfaces;

import com.example.observer.observers.interfaces.Subscriber;

public interface Channel {

    void addSubs(Subscriber sub);
    void deleteSubs(Subscriber sub);
    void notifySubs();
    void deleteAllSubs();
    void uploadVideo(String Path);
    String getLatestVideo();
    String getName();

}
