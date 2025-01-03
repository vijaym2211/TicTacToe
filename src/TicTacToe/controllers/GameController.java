package TicTacToe.controllers;

import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.models.Game;
import TicTacToe.models.GameStatus;
import TicTacToe.models.Player;

import java.util.List;

public class GameController {
    public Game createGame(List<Player> playerList) throws InvalidBotCountException {
        Game game = Game.getBuilder()
                .setPlayers(playerList)
                .build();
        return game;
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWiner(Game game) {
        return game.getWiner();
    }
}