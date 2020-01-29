package BoxLayout;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.lang.System.exit;
import javax.swing.*;

public class BoxLayoutex extends JFrame implements WindowListener {

    Button buttons[];
    public BoxLayoutex() 
    {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
            buttons[i].setBackground(Color.orange);
        }

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
        addWindowListener(this);
            
    }

    public static void main(String args[]) {
        new BoxLayoutex();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
      exit(0);
      //sir G we can also used dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
