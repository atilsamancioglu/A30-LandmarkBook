package com.atilsamancioglu.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    int image;

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
