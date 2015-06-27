package View;

import Model.Cube;
import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Юрий on 27.06.2015.
 */
public class MainForm  extends JFrame{
    public MainForm() {
        super();
        this.add(new Panel());

    }

    public static void main(String[] args) {
        new MainForm().setVisible(true);
    }
}


class Panel extends JPanel {

    @Override
    public void paintComponents(Graphics g) {

        try {
            g.drawImage(Cube.getInstance().getView(), 0, 0, null);
        } catch (Exception e) {

        }

    }


}