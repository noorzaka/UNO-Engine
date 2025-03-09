package card;

import game.Game;

public class ReverseCard extends Card {
    public ReverseCard(Color color, int priority) {
        super(color, "REVERSE", 20, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Reverse Card");
        game.reverseDirection();
    }
}
