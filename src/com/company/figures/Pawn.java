package com.company.figures;

import com.company.board.Chess;
import com.company.board.Location;
import com.company.types.Side;

public class Pawn extends ChessFigure {

    public Pawn(int x_coord, int y_coord, Side side, Chess chess) {
        super(x_coord, y_coord, side, chess);

        if (this.side == Side.WHITE) sideCoeff = 1;
        else sideCoeff = -1;
    }

    @Override
    public boolean findAllPath() {
        locationsToMove.add(new Location(x_coord - (sideCoeff)*1,y_coord+(sideCoeff)*1));
        locationsToMove.add(new Location(x_coord,y_coord+(sideCoeff)*1));
        locationsToMove.add(new Location(x_coord,y_coord+(sideCoeff)*2));
        locationsToMove.add(new Location(x_coord+(sideCoeff)*1,y_coord+(sideCoeff)*1));
        return false;
    }

    //TODO with null
    @Override
    public void weedOut() {
        Location locationToCheck = null;

        for (Location location :
                    locationsToMove) {
            if (location.getX_coord() == x_coord - (sideCoeff) * 1 && location.getY_coord() == y_coord + (sideCoeff) * 1)
                    locationToCheck = location;

            if (location.getX_coord() == x_coord + (sideCoeff) * 1 && location.getY_coord() == y_coord + (sideCoeff) * 1)
                    locationToCheck = location;


            if (chess.getChessFigureByCoord(locationToCheck) == null) {
                    locationsToMove.remove(locationToCheck);
            }
        }



    }

    @Override
    public boolean kill() {
        return false;
    }

    @Override
    public boolean move() {
        return false;
    }
}
