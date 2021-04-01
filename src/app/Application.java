package app;

import adapter.SquareToRoundAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Application {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fitsSize(roundPeg)){
            System.out.println("Round pegs fit round hols!");
        } else {
            System.err.println("Error. Round pegs don't fit round hols.");
        }

        SquarePeg squarePeg = new SquarePeg(7);
        SquareToRoundAdapter squareToRoundAdapter = new SquareToRoundAdapter(squarePeg);

        if (roundHole.fitsSize(squareToRoundAdapter)){
            System.out.println("Square pegs fit round hols!");
        } else {
            System.err.println("Error. Square pegs don't fit round hols.");
        }
    }
}
