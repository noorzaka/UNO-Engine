package card;

public class CardFactory {
    public static Card createCard(String type, Color color, int value, int priority) {
        switch (type) {
            case "Numbered":
                return new NumberedCard(color, value, priority);
            case "SKIP":
                return new SkipCard(color, priority);
            case "REVERSE":
                return new ReverseCard(color, priority);
            case "DRAW_TWO":
                return new DrawTwoCard(color, priority);
            case "WILD":
                return new WildCard(color, priority);
            case "WILD_DRAW_FOUR":
                return new WildDrawFourCard(color, priority);
            case "SLAP":
                return new SlapCard(color, priority);
            default:
                throw new IllegalArgumentException("Invalid card type: " + type);
        }
    }
}
