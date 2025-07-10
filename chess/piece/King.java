package chess.piece;

import chess.board.Board;
import chess.board.Cell;

public class King extends Piece {
    public King(PieceColor color) {
        super(color, (color == PieceColor.WHITE) ? 'K' : 'k');
    }

    @Override
    public boolean isValidMove(Cell from, Cell to, Board board) {
        int dx = Math.abs(to.getX() - from.getX());
        int dy = Math.abs(to.getY() - from.getY());
        return (dx == 1 && dy == 0) || (dx == 0 && dy == 1) || (dx == 1 && dy == 1);
    }
}
