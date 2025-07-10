package Hub;

import Games.TicTacToe.TicTacToe;
import Games.Chess.Chess;
import Games.SnakesAndLadders.SnakesAndLadders;

public class GameFactory {
    public static Game getGame(int choice) {
        return switch (choice) {
            case 1 -> new TicTacToe();
            case 2 -> new Chess();
            case 3 -> new SnakesAndLadders();
            default -> null;
        };
    }
}
