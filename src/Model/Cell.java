package Model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

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

    public Image getView() throws IOException{
        String str = "/images/" + color.name() +".jpg";
        URL url = getClass().getResource(str);
        return ImageIO.read(url);
    }
}
