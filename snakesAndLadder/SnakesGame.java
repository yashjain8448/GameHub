package snakesAndLadder;

import snakesAndLadder.board.Board;
import snakesAndLadder.board.BoardFactory;
import snakesAndLadder.board.Game;
import snakesAndLadder.player.Player;
import snakesAndLadder.player.PlayerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SnakesGame {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number of Games : ");
        int countOfGames = scn.nextInt();
        List<Game> games = new ArrayList<>();

        for(int gameId = 1; gameId <= countOfGames; gameId++) {
            PlayerFactory playerFactory = new PlayerFactory();
            List<Player> players = playerFactory.getPlayers();

            Board board = BoardFactory.getInstance().getBoard();
            games.add(new Game(gameId, board, players));
        }

        games.forEach(Thread::start);
    }
}
