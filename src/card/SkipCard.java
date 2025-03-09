package card;

import game.Game;

public class SkipCard extends Card {
    public SkipCard(Color color, int priority) {
        super(color, "SKIP", 20, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Skip Card");
        game.skipNextPlayer();
    }
}
