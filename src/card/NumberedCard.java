package card;

import game.Game;

public class NumberedCard extends Card {
    public NumberedCard(Color color, int value, int priority) {
        super(color, "Numbered", value, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Numbered Card: " + getValue());
    }
}
