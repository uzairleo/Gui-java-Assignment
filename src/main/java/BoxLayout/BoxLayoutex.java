package BoxLayout;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutex extends Frame {

    Button buttons[];

    public BoxLayoutex() {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
            buttons[i].setBackground(Color.orange);
        }

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
            
    }

    public static void main(String args[]) {
        new BoxLayoutex();
    }
}
