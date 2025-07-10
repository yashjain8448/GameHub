package tictactoe.evaluator;

import tictactoe.board.Board;
import tictactoe.player.Piece;

public interface BoardEvaluator {
    boolean evaluate(Board board, Piece piece);
}
