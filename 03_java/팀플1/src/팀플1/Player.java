package 팀플1;

import java.util.Scanner;

public abstract class Player {
    private final String name;
    private final Stone stone;

    public Player(String name, Stone stone) {
        this.name = name;
        this.stone = stone;
    }

    public String getName() {
        return name;
    }

    public Stone getStone() {
        return stone;
    }

    public abstract Position chooseMove(Board board, Scanner scanner);
}