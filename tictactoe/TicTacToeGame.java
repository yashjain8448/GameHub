package tictactoe;

import java.util.Scanner;
import tictactoe.board.Game;
public class TicTacToeGame {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int totalPlayers, boardSize;

        while(true) {
            try {
                System.out.print("Enter Total Players [>1] : ");
                totalPlayers = scanner.nextInt();
                if (totalPlayers <= 1) throw new Exception("Players Can't be < 2");

                System.out.print("Enter Board Size [>= Total Players] : ");
                boardSize = scanner.nextInt();
                if (boardSize >= totalPlayers) break;
                throw new Exception("Board Size Can't Be Less Than Players");
            }
            catch (Exception e) {
                System.out.println("Error : " + e.getMessage() + ", Please Try Again !");
                scanner.nextLine(); // Consume the invalid input to prevent infinite loop
            }
        }

        Game game = new Game(boardSize, totalPlayers);
        game.start();
    }
}
