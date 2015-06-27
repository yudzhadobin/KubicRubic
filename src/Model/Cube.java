package Model;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Cube {
    private final static Cube instance = new Cube();


    private Cube() {
    }

    final Side left = new Side(Color.YELLOW);
    final Side top = new Side(Color.WHITE);
    final Side right = new Side(Color.GREEN);
    final Side front = new Side(Color.VIOLET);
    final Side back = new Side(Color.RED);
    final Side bottom = new Side(Color.BLUE);

    public Side getLeft() {
        return left;
    }

    public Side getTop() {
        return top;
    }

    public Side getRight() {
        return right;
    }

    public Side getFront() {
        return front;
    }

    public Side getBack() {
        return back;
    }

    public Side getBottom() {
        return bottom;
    }

    public static Cube getInstance() {
        return instance;
    }

    public Image getView() {
        int sizeOfOneSide = Settings.SIZE_OF_IMAGE * Side.SIZE;
        BufferedImage view = new BufferedImage(sizeOfOneSide * 3, sizeOfOneSide * 4, BufferedImage.TYPE_INT_RGB);
        try {
            view.getGraphics().drawImage(left.getView(), 0, sizeOfOneSide, null);

            view.getGraphics().drawImage(top.getView(), sizeOfOneSide, sizeOfOneSide, null);
            view.getGraphics().drawImage(right.getView(), sizeOfOneSide * 2, sizeOfOneSide, null);
            view.getGraphics().drawImage(back.getView(), sizeOfOneSide, 0, null);
            view.getGraphics().drawImage(front.getView(), sizeOfOneSide, sizeOfOneSide * 2, null);
            view.getGraphics().drawImage(bottom.getView(), sizeOfOneSide, sizeOfOneSide * 3, null);
        } catch (IOException excep) {
            System.out.println(excep.toString());
            return null;
        }
        return view;
    }
}
