package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WebLayout implements ActionListener {

    JFrame blFrame = new JFrame();
    JButton south = new JButton("SOUTH");
    JButton east = new JButton("EAST");
    JButton center = new JButton("CENTER");
    JButton west = new JButton("WEST");
    JButton north = new JButton("NORTH");

    public WebLayout() {
        blFrame.setSize(600, 600);
        blFrame.setVisible(true);
        blFrame.setDefaultCloseOperation(3);
        blFrame.setAlwaysOnTop(true);
        blFrame.setLayout(new BorderLayout());

        blFrame.add(south, BorderLayout.SOUTH);
        blFrame.add(east, BorderLayout.EAST);
        blFrame.add(center, BorderLayout.CENTER);
        blFrame.add(west, BorderLayout.WEST);
        blFrame.add(north, BorderLayout.NORTH);

        south.addActionListener(this);
        east.addActionListener(this);
        center.addActionListener(this);
        west.addActionListener(this);
        north.addActionListener(this);

    }

    public static void main(String[] args) {
        new WebLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == south) {

            if (south.getText() == "SOUTH") {
                south.setBackground(new Color(51, 204, 255));
                south.setText("You press SOUTH  ");
            } else {
                south.setBackground(null);
                south.setText("SOUTH");
            }
        } else if (e.getSource() == north) {
            if (north.getText() == "NORTH") {
                north.setBackground(new Color(255, 153, 102));
                north.setText("You press NORTH ");
            } else {
                north.setBackground(null);
                north.setText("NORTH");
            }
        } else if (e.getSource() == center) {
            if (center.getText() == "CENTER") {
                center.setBackground(new Color(102, 255, 51));
                center.setText("You press CENTER ");
            } else {
                center.setBackground(null);
                center.setText("CENTER");
            }
        } else if (e.getSource() == east) {
            if (east.getText() == "EAST") {
                east.setBackground(new Color(255, 204, 102));
                east.setText("You press EAST ");
            } else {
                east.setBackground(null);
                east.setText("EAST");

            }
        } else if (e.getSource() == west) {
            if (west.getText() == "WEST") {
                west.setBackground(new Color(204, 255, 51));
                west.setText("You press WEST ");
            } else {
                west.setBackground(null);
                west.setText("WEST");

            }
        }

    }

}
