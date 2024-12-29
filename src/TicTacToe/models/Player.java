package TicTacToe.models;

import lombok.Data;

@Data
public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(char symbol, String name) {
        this.name = name;
        this.symbol = symbol;
    }
    abstract Pair<Integer, Integer> makeMove();
}
