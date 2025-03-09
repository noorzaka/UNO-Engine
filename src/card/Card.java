package card;

import game.Game;

public abstract class Card {
    private final Color color;
    private final String type;
    private final int value;
    private final int priority;

    protected Card(Color color, String type, int value, int priority) {
        this.color = color;
        this.type = type;
        this.value = value;
        this.priority = priority;
    }

    public Color getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }

    public abstract void play(Game game);
}
