package driver;

import game.Game;
import game.SlapUnoGame;

public class GameDriver {
    public static void main(String[] args) {
        Game game = new SlapUnoGame();
        game.play();
    }
}
