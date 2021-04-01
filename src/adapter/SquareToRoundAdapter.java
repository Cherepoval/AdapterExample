package adapter;

import round.RoundPeg;
import square.SquarePeg;

public class SquareToRoundAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquareToRoundAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius(){
        double compatibleRadius;
        compatibleRadius = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
        return compatibleRadius;
    }
}
