package TicTacToe.strategies.bot_playing_strategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Pair;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell: row){
                if(cell.isEmpty()){
                    return new Pair<>(cell.getX(), cell.getY());
                }
            }
        }
        return null;
    }
}