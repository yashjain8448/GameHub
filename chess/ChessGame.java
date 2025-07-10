package chess;

import chess.board.Game;
import chess.player.HumanPlayer;
import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Player 1 Name With White Pieces : ");
        String whitePlayerName = scanner.next();

        System.out.println("Input Player 2 Name With Black Pieces : ");
        String blackPlayerName = scanner.next();

        Game game = new Game(new HumanPlayer(whitePlayerName), new HumanPlayer(blackPlayerName));
        game.start();

    }

}
