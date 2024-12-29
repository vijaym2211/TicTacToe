package TicTacToe.models;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(char symbol, String name) {
        super(symbol, name);
    }


    @Override
    Pair<Integer, Integer> makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x= scanner.nextInt();
        System.out.println("Enter y");
        int y= scanner.nextInt();
        return new Pair<>(x,y);
    }

    void undo(){

    }
}