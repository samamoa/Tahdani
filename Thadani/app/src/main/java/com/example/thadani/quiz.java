package com.example.thadani;

public class quiz {


    private int image;
    private int imageTwo;
    private String level;

    public quiz(int image, int imageTwo,String level) {
        this.image = image;
        this.imageTwo = imageTwo;
        this.level= level;
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
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

