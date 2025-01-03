package TicTacToe.factories;

import TicTacToe.models.BotLevel;
import TicTacToe.strategies.bot_playing_strategy.BotPlayingStrategy;
import TicTacToe.strategies.bot_playing_strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotLevel level){
        if(level == BotLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if (level == BotLevel.MEDIUM){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}