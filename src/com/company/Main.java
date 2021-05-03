package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
/*Transient применяется к временным приложениям.
Поля которые обозначаются transient не  сериализуемые и не десериализуемые. */
public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<PlaceOfOrigin> place = new ArrayList<>();
        place.add(new PlaceOfOrigin(NameOfFlower.CAMELLIA, "Hawaii",1500));
        place.add(new PlaceOfOrigin(NameOfFlower.DAVID_AUSTIN_ROSE,"United Kingdom",1000));
        place.add(new PlaceOfOrigin(NameOfFlower.GORDONIA,"Thailand",1400));
        place.add(new PlaceOfOrigin(NameOfFlower.HIBISCUS,"Maldives",1200));
        Flower flower = new Flower(5000, "Red", 6, place);
        String flowerJson = gson.toJson(flower);
        System.out.println(flowerJson);
        Flower fromJsonToClass = gson.fromJson(flowerJson, Flower.class);
        System.out.println(fromJsonToClass);
    }
}
