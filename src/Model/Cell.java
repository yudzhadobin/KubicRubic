package Model;

import java.awt.*;

/**
 * One cell of kubic's side.
 */
public class Cell {
    private Color color;

    public Cell() {
        color = Color.RED;
    }

    public Cell(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
