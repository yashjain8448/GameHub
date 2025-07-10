package tictactoe.board;

import tictactoe.player.Player;
import tictactoe.player.PlayerFactory;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private final Board board;
    private final Queue<Player> playerQueue = new LinkedList<>();

    public Game(int boardSize, int totalPlayers) {
        this.board = new Board(boardSize);

        PlayerFactory playerFactory = new PlayerFactory();
        for(int player = 1; player <= totalPlayers; player++) {
            playerQueue.add(playerFactory.getPlayer(player));
        }
    }

    public void start() {
        while(true) {
            Player turn = playerQueue.remove();
            System.out.println("Turn of Player " + turn.getName()
                    + " with Piece " + turn.getPiece());

            BoardState state = turn.makeMove(board);
            board.printBoard();

            if(state == BoardState.WIN) {
                System.out.println("Player " + turn.getName() + " Wins");
                return;
            }

            if(state == BoardState.DRAW) {
                System.out.println("Game Ends in a Draw");
                return;
            }

            playerQueue.add(turn);
        }
    }
}