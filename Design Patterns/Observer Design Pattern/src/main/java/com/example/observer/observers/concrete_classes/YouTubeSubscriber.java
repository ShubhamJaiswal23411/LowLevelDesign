package com.example.observer.observers.concrete_classes;

import java.util.HashMap;
import java.util.Map;

import com.example.observer.observable.interfaces.Channel;
import com.example.observer.observers.interfaces.Subscriber;

public class YouTubeSubscriber implements Subscriber {

    private final Map<String , Channel> subbedChannels = new HashMap<>();
    private final String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void fetchLatestVideo(String name) {
        Channel curChannel = subbedChannels.get(name);
        String latestVideo = curChannel.getLatestVideo();
        System.out.println("i "+this.name+" am watching "+curChannel.getName()+"'s latest video titled "+ latestVideo);
    }

    @Override
    public void subscribe(Channel channel) {
        subbedChannels.put(channel.getName(), channel);
        channel.addSubs(this);
        System.out.println("i "+this.name +" subscribed to "+channel.getName());
    }

    @Override
    public void unSubscribe(Channel channel) {
        subbedChannels.remove(channel.getName(), channel);
        channel.deleteSubs(this);
        System.out.println("i "+this.name +" unsubscribed to "+channel.getName());
    }

}
