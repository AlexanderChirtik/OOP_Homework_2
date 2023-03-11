package org.example;

public class Treadmill extends Obstacles{
    public Treadmill(int length) {
        super.category = "Treadmill";
        this.length = length;
    }

    /**
     * Длина беговой дорожки
     */
    private int length;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}
