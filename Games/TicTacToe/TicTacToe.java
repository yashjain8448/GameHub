package Games.TicTacToe;

import Hub.Game;

public class TicTacToe implements Game {
    @Override
    public void play() {
        tictactoe.TicTacToeGame.main(null); // or whatever class you renamed from Main.java
    }
}
