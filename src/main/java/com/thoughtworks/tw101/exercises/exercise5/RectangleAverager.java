package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int combinedSize = 0;
        for(int i = 0; i < rectangles.length; i ++) {
            combinedSize += rectangles[i].area();
        }
        return combinedSize/rectangles.length;
    }
}
