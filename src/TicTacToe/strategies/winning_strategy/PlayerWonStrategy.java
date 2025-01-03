package TicTacToe.strategies.winning_strategy;

import TicTacToe.models.Cell;

public interface PlayerWonStrategy {
    boolean checkIfWon(Cell cell);
}
