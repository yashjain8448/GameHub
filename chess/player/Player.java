package chess.player;

import chess.board.Board;
import chess.piece.PieceColor;

public abstract class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Move getMove(Board board, PieceColor color);
}