package TicTacToe.models;

import TicTacToe.factories.BotPlayingStrategyFactory;
import TicTacToe.strategies.bot_playing_strategy.BotPlayingStrategy;

public class Bot extends Player{

    private BotPlayingStrategy botPlayingStrategy;
    private BotLevel botLevel;
    public Bot(char symbol, String name, BotLevel botLevel) {
        super(symbol, name);
        this.botLevel = botLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botLevel);
    }

    @Override
    Pair<Integer, Integer> makeMove(Board board) {
        System.out.println("Bot is making it's move, beware!");
        return botPlayingStrategy.makeMove(board);
    }
}
