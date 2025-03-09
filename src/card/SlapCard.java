package card;

import game.Game;

public class SlapCard extends Card {
    public SlapCard(Color color, int priority) {
        super(color, "SLAP", 50, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Slap Card");
    }
}
