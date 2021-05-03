package com.company;

public class PlaceOfOrigin {
    private NameOfFlower nameOfFlower;
    private transient String place;
    private transient int year;

    public PlaceOfOrigin(NameOfFlower nameOfFlower, String place, int year) {
        this.nameOfFlower = nameOfFlower;
        this.place = place;
        this.year = year;
    }

    public NameOfFlower getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(NameOfFlower nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "PlaceOfOrigin{" +
                "nameOfFlower=" + nameOfFlower +
                ", place='" + place + '\'' +
                ", year=" + year +
                '}';
    }
}
