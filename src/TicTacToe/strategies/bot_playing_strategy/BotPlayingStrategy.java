package TicTacToe.strategies.bot_playing_strategy;

import TicTacToe.models.Board;
import TicTacToe.models.Pair;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}