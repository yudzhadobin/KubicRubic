package Model;

import java.awt.*;

public class Side {
    Cell[][] field;

    private final int SIZE = 9;


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
}