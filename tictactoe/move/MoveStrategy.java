package tictactoe.move;

import tictactoe.board.Board;

public interface MoveStrategy {
    Move getMove(Board board);
}
