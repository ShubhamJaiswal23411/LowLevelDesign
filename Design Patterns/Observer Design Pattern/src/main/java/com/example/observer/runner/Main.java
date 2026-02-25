package com.example.observer.runner;


import com.example.observer.observable.concrete_classes.YouTubeChannel;
import com.example.observer.observable.interfaces.Channel;
import com.example.observer.observers.concrete_classes.YouTubeSubscriber;
import com.example.observer.observers.interfaces.Subscriber;

public class Main {
    public static void main(String[] args) {
        Channel FlyingBeast = new YouTubeChannel("FlyingBeast");
        Channel SaurabhJoshiVlogs = new YouTubeChannel("SaurabhJoshiVlogs");

        Subscriber sub1 = new YouTubeSubscriber("sub1");
        Subscriber sub2 = new YouTubeSubscriber("sub2");
        Subscriber sub3 = new YouTubeSubscriber("sub3");
        //subscribers subscribing
        sub1.subscribe(SaurabhJoshiVlogs);
        sub2.subscribe(FlyingBeast);
        sub3.subscribe(SaurabhJoshiVlogs);
        //channel uploading
        FlyingBeast.uploadVideo("daily vlog where somethign happened");
        SaurabhJoshiVlogs.uploadVideo("Revaling who the wife is??");

        //changes in the subscriber
        sub2.subscribe(SaurabhJoshiVlogs);
        sub1.subscribe(FlyingBeast);
        sub3.unSubscribe(SaurabhJoshiVlogs);
        //uploading again
        FlyingBeast.uploadVideo("daily vlog full update");
        SaurabhJoshiVlogs.uploadVideo("Showing her the new home");

    }
}
