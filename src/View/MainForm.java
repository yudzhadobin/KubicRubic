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
        this.setSize(new Dimension(1900,1900));
       this.setVisible(true);
    }

    public static void main(String[] args) {
       MainForm form = new MainForm();
       form.getGraphics().drawImage(Cube.getInstance().getView(),0,0,900,900,null);
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