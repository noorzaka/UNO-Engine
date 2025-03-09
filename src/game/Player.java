package game;

import card.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
        System.out.println(name + " added " + card.getType() + " to their hand.");
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
        System.out.println(name + " removed " + card.getType() + " from their hand.");
    }

    public void displayHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            System.out.println(card.getType());
        }
    }
}
