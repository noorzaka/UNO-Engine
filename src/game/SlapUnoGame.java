package game;

import card.Card;
import card.CardFactory;
import card.Color;
import card.DrawTwoCard;
import card.SlapCard;
import deck.Deck;
import java.util.ArrayList;
import java.util.List;

public class SlapUnoGame extends Game {

    @Override
    public void startGame() {
        System.out.println("Starting Slap Uno Game");
        // Implement game logic specific to Slap Uno
    }

    @Override
    public void setupCards() {
        System.out.println("Setting up Slap Uno cards");
        availableCards.addAll(createSlapUnoDeck());
    }

    @Override
    public void setupDeck() {
        deck = new Deck();
        for (Card card : availableCards) {
            deck.addCard(card);
        }
        deck.shuffle();
        System.out.println("Deck is set up and shuffled");
    }

    @Override
    public void setupPlayers() {
        System.out.println("Setting up players");
        // Add logic to set up players
    }

    @Override
    public void setupRules() {
        System.out.println("Setting up rules for Slap Uno");
        // Add custom rules for Slap Uno
    }

    @Override
    public void setupScoring() {
        scoringSystem = new ScoringSystem();
        System.out.println("Setting up scoring system for Slap Uno");
    }

    private List<Card> createSlapUnoDeck() {
        List<Card> cards = new ArrayList<>();

        // Adding Numbered and Colored cards
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

        // Adding modified Draw Two Card
        for (Color color : Color.values()) {
            if (color != Color.WILD) {
                cards.add(new DrawTwoCard(color, 20));  // Custom behavior: Draw Two from owner
            }
        }

        // Adding Slap Card
        for (int i = 0; i < 4; i++) {
            cards.add(new SlapCard(Color.WILD, 50));  // Custom Slap Card
        }

        return cards;
    }
}
