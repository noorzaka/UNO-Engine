package game;

public abstract class Rule {
    private boolean clockwise;
    private int drawCount;
    private boolean playAfterChangeColor;

    // Getters and setters
    public boolean isClockwise() {
        return clockwise;
    }

    public void setClockwise(boolean clockwise) {
        this.clockwise = clockwise;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public boolean isPlayAfterChangeColor() {
        return playAfterChangeColor;
    }

    public void setPlayAfterChangeColor(boolean playAfterChangeColor) {
        this.playAfterChangeColor = playAfterChangeColor;
    }

}
