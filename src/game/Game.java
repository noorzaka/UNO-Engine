package game;

import card.Card;
import card.Color;
import deck.Deck;

import java.util.ArrayList;
import java.util.List;

public abstract class Game implements DeveloperInterface {
    protected List<Card> availableCards = new ArrayList<>();
    protected Deck deck;
    protected List<Player> players = new ArrayList<>();
    protected List<Rule> rules = new ArrayList<>();
    protected ScoringSystem scoringSystem;
    protected Color currentColor;
    protected boolean isClockwise = true;
    protected int currentPlayerIndex = 0;

    public final void play() {
        setupCards();
        setupDeck();
        setupPlayers();
        setupRules();
        setupScoring();
        startGame();
    }

    public abstract void startGame();

    public void reverseDirection() {
        isClockwise = !isClockwise;
        System.out.println("Direction reversed. Now playing " + (isClockwise ? "clockwise" : "counterclockwise"));
    }

    public void skipNextPlayer() {
        System.out.println("Skipping next player's turn.");
        moveToNextPlayer();
    }

    public void changeColor(Color newColor) {
        this.currentColor = newColor;
        System.out.println("Color changed to: " + newColor);
    }

    public void drawCards(int numberOfCards) {
        Player currentPlayer = players.get(currentPlayerIndex);
        System.out.println(currentPlayer.getName() + " draws " + numberOfCards + " card(s).");

        for (int i = 0; i < numberOfCards; i++) {
            if (!deck.isEmpty()) {
                Card drawnCard = deck.drawCard();
                currentPlayer.addCardToHand(drawnCard);
                System.out.println(currentPlayer.getName() + " drew: " + drawnCard.getType());
            } else {
                System.out.println("The deck is empty. No more cards to draw.");
                break;
            }
        }
    }

    protected void moveToNextPlayer() {
        if (isClockwise) {
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        } else {
            currentPlayerIndex = (currentPlayerIndex - 1 + players.size()) % players.size();
        }
    }
}
