package com.company.figures;

import com.company.board.Chess;
import com.company.board.Location;
import com.company.types.Side;

import java.util.ArrayList;
import java.util.List;

public abstract class ChessFigure {
    protected int x_coord;
    protected int y_coord;
    protected Side side;
    protected int sideCoeff;

    protected Chess chess;
    protected List<Location> locationsToMove;

    public ChessFigure(int x_coord, int y_coord, Side side, Chess chess) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.side = side;
        this.chess = chess;
        locationsToMove = new ArrayList<>();
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

    public abstract boolean findAllPath();
    public abstract void weedOut();
    public abstract boolean kill();
    public abstract boolean move();
}
