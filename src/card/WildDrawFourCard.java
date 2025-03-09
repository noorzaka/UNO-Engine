package card;

import game.Game;

public class WildDrawFourCard extends Card {
    public WildDrawFourCard(Color color, int priority) {
        super(color, "WILD_DRAW_FOUR", 50, priority);
    }

    @Override
    public void play(Game game) {
        System.out.println("Playing Wild Draw Four Card");
        game.changeColor(getColor());
        game.drawCards(4);
    }
}
