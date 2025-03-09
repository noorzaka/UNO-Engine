package deck;

import card.Card;
import card.CardFactory;
import card.Color;
import card.DrawTwoCard;

import java.util.ArrayList;
import java.util.List;

public class StandardDeck extends DeckInitializer {
    private static StandardDeck instance;

    private StandardDeck() {}

    public static StandardDeck getInstance() {
        if (instance == null) {
            instance = new StandardDeck();
        }
        return instance;
    }

    @Override
    public List<Card> initializeDeck() {
        List<Card> cards = new ArrayList<>();

        for (Color color : Color.values()) {
            if (color != Color.WILD) {
                for (int number = 0; number <= 9; number++) {
                    cards.add(CardFactory.createCard("Numbered", color, number, number));
                    if (number != 0) {
                        cards.add(CardFactory.createCard("Numbered", color, number, number));
                    }
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (Color color : Color.values()) {
                if (color != Color.WILD) {
                    cards.add(CardFactory.createCard("SKIP", color, 20, 0));
                    cards.add(CardFactory.createCard("REVERSE", color, 20, 0));
                    cards.add(new DrawTwoCard(color, 20));
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            cards.add(CardFactory.createCard("WILD", Color.WILD, 50, 1));
            cards.add(CardFactory.createCard("WILD_DRAW_FOUR", Color.WILD, 50, 1));
        }

        return cards;
    }
}
