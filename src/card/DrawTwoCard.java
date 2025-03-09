package card;

import game.Game;

public class DrawTwoCard extends Card {
    public DrawTwoCard(Color color, int priority) {
        super(color, "DRAW_TWO", 20, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Draw Two Card");
    }
}
