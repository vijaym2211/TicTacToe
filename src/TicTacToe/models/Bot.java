package TicTacToe.models;

public class Bot extends Player{
    private BotLevel botLevel;
    public Bot(char symbol, String name, BotLevel botLevel) {
        super(symbol, name);
        this.botLevel = botLevel;
    }

    @Override
    Pair<Integer, Integer> makeMove() {
        return null;
    }
}
