package chess.piece;

import chess.board.Board;
import chess.board.Cell;

public class Knight extends Piece {
    public Knight(PieceColor color) {
        super(color, (color == PieceColor.WHITE) ? 'N' : 'n');
    }

    @Override
    public boolean isValidMove(Cell from, Cell to, Board board) {
        int dx = Math.abs(to.getX() - from.getX());
        int dy = Math.abs(to.getY() - from.getY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}