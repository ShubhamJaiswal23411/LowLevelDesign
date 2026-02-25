package com.example.observer.observable.concrete_classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.observer.observable.interfaces.Channel;
import com.example.observer.observers.interfaces.Subscriber;

public class YouTubeChannel implements Channel {

    private final Set<Subscriber> subList = new HashSet<>();
    private final String name;
    private final List<String> videoList = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void addSubs(Subscriber sub) {
        if (sub != null) {
            subList.add(sub);
        } else {
            System.out.println("Subscriber is null");
        }
    }

    @Override
    public void deleteSubs(Subscriber sub) {
        if (sub != null && subList.contains(sub)) {
            subList.remove(sub);
        }
    }

    @Override
    public void deleteAllSubs() {
        subList.clear();
    }

    @Override
    public void notifySubs() {
        System.out.println("Sending Notification to all subscribers");
        for (Subscriber sub : subList) {
            sub.fetchLatestVideo(name);
        }
    }

    @Override
    public void uploadVideo(String path) {
        System.out.println("I "+this.name+" am uploading a new video titled - " + path);
        videoList.add(path);
        notifySubs();
    }

    @Override
    public String getLatestVideo() {
        if (videoList.size() == 0)
            return "No videos available at the time, please check later";
        return videoList.get(videoList.size() - 1);
    }

    public String getName() {
        return this.name;
    }

}
