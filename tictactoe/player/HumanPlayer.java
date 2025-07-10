package tictactoe.player;

import tictactoe.move.HumanMoveStrategy;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, Piece piece) {
        super(name, piece, HumanMoveStrategy.getInstance());
    }
}
