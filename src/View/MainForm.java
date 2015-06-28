package View;

import Model.Cube;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MainForm  extends JFrame{
    public MainForm() {
        super();
        this.setSize(new Dimension(500, 500));
        this.setVisible(true);
        this.add(new ImagePanel());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainForm form = new MainForm();
    }
}


class ImagePanel extends JPanel{

    private Image image;

    public ImagePanel() {
        image = Cube.getInstance().getView();
        this.setVisible(true);
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
    }

}