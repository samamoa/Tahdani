package com.example.thadani;

import java.util.logging.Level;

public class qiz {
    private int image;
    private int imageTwo;
   private   String levelTwo;

    public qiz(int image, int imageTwo, String levelTwo) {
        this.image = image;
        this.imageTwo = imageTwo;
        this.levelTwo = levelTwo;
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

    public String getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(String levelTwo) {
        this.levelTwo = levelTwo;
    }
}