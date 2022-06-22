package Turtle;

public class Sketchpad {
    private final int[][] floor;

    public Sketchpad(int column, int row) {
        floor = new int[row][column];
    }

    public int[][] getFloor() {
        return floor;
    }
}
