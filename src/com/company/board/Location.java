package com.company.board;

public class Location {
    private int x_coord;
    private int y_coord;

    public Location(int x_coord, int y_coord) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
    }

    public int getX_coord() {
        return x_coord;
    }

    public void setX_coord(int x_coord) {
        this.x_coord = x_coord;
    }

    public int getY_coord() {
        return y_coord;
    }

    public void setY_coord(int y_coord) {
        this.y_coord = y_coord;
    }
}
