package GridLayout;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.BoxLayout;


class Converter extends JFrame implements ActionListener 
{


    JPanel panel = new JPanel();
    JTextField input = new JTextField(10);
    JButton but1 = new JButton ("Convert");
    JLabel label = new JLabel();
    JTextArea output = new JTextArea(1, 20);



    public Converter()
        {
            super("temperature converter");
            setSize(500, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            panel.add(input);
            but1.addActionListener(this);
            add(panel);
            panel.add(output);
            label.setText ("please enter celsius to be converted to Fahrenheit");
            panel.add(but1);
            panel.add(label);
            setVisible(true);   
        }

    
    

    public static void main(String[] args)
        {
            
            Converter gui = new Converter();
//30            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};30

        }

    public void actionPerformed(ActionEvent event)
    {try{
        String inputStr = input.getText();
        inputStr = inputStr.trim();
        double input = Double.parseDouble(inputStr);
        double fahrenheit = input * 1.8 + 32;


        if (event.getSource() == but1)
        {
            output.setText("Here is degrees celsius " + input + " converted `to Fahrenheit: " + fahrenheit);
        }
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "enter a valid input plz");
    }
    }


}
