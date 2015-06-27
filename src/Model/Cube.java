package Model;

import java.awt.*;

public class Cube {
    private final static Cube instance= new Cube();


    private Cube() {}
    
    final Side left = new Side(Color.YELLOW);
    final Side top = new Side(Color.WHITE);
    final Side right = new Side(Color.GREEN);
    final Side front = new Side(Color.PINK);
    final Side back = new Side(Color.ORANGE);
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
}
