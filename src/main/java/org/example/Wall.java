package org.example;

public class Wall extends Obstacles{
    public Wall(int height) {
        super.category = "Wall";
        this.height = height;
    }

    /**
     * Высота стены
     */
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
