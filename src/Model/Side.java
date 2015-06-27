package Model;



import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Side {
    Cell[][] field;

    public static final int SIZE = 3;


    public Cell[][] getField() {
        return field;
    }

    public Side() {
        field = new Cell[SIZE][SIZE];
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = new Cell();
            }
        }
    }

    public Side(Color color) {
        field = new Cell[SIZE][SIZE];
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = new Cell(color);
            }
        }
    }

    public Image getView() throws IOException{
        BufferedImage view = new BufferedImage(SIZE*Settings.SIZE_OF_IMAGE, SIZE*Settings.SIZE_OF_IMAGE,BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                view.getGraphics().drawImage(field[i][j].getView(), i * Settings.SIZE_OF_IMAGE, j * Settings.SIZE_OF_IMAGE, Settings.SIZE_OF_IMAGE, Settings.SIZE_OF_IMAGE, null);
            }
        }

        return view;
    }
}