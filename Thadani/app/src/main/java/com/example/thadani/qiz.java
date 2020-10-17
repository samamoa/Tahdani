package com.example.thadani;

import java.util.logging.Level;

public class qiz {
    private int image;
    private int imageTwo;
    private String LevelTwo;


    public qiz(int image, int imageTwo,String LevelTwo) {
        this.image = image;
        this.imageTwo = imageTwo;
        this.LevelTwo= LevelTwo;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(int imageTwo) {
        this.imageTwo = imageTwo;
    }

    public String getLevel() {
        return LevelTwo;
    }

    public void setLevel(String level) {
        LevelTwo = LevelTwo;
    }
}