package com.example.judas;

public class Chat {
    private String name;
    private String lastMessage;
    private String time;
    private int imageResource;
    private Class fragmentClass;

    public Chat(String name, String lastMessage, String time, int imageResource) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.time = time;
        this.imageResource = imageResource;
        this.fragmentClass = fragmentClass;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public Class getFragmentClass() {
        return fragmentClass;
    }

    public void setFragmentClass(Class fragmentClass) {
        this.fragmentClass = fragmentClass;
    }
}
