package card;

import game.Game;

public class WildCard extends Card {
    public WildCard(Color color, int priority) {
        super(color, "WILD", 50, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Wild Card");
        game.changeColor(getColor());
    }
}
