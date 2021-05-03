package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Flower implements Serializable {

    private transient int cost;
    private String color;
    private int liveTime;
    private List<PlaceOfOrigin> place;


    public Flower(int cost, String color, int liveTime, List<PlaceOfOrigin> place) {
        this.cost = cost;
        this.color = color;
        this.liveTime = liveTime;
        this.place = place;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(int liveTime) {
        this.liveTime = liveTime;
    }

    public List<PlaceOfOrigin> getPlace() {
        return place;
    }

    public void setPlace(List<PlaceOfOrigin> place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Flower{" +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", liveTime=" + liveTime +
                ", place=" + place +
                '}';
    }
}
