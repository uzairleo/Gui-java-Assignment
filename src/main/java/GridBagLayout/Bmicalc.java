package GridBagLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bmicalc implements ActionListener{
    
    JFrame bmiFrame=new JFrame("Bmi_Calculator");
    JButton calculate=new JButton("Calculate");
    JTextField weight=new JTextField("in kg");
    JTextField height=new JTextField("in cm");
    JLabel wlabel=new JLabel(" Weight: ");
    JLabel hlabel=new JLabel(" Height: ");
    JLabel pressme=new JLabel("     =>      ");
    GridBagConstraints gbc=new GridBagConstraints();
    GridBagLayout layout=new GridBagLayout();
    JTextArea result=new JTextArea("Result :     Here is ur Bmi");
    
    public Bmicalc()
    {
      bmiFrame.setSize(380,250);
      bmiFrame.setVisible(true);
      bmiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bmiFrame.setLayout(layout);
      bmiFrame.setAlwaysOnTop(true);
//      bmiFrame.setBackground(Color.green);
      
      weight.setColumns(10);
      height.setColumns(10);
      
      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=0;
      gbc.gridy=0;
      bmiFrame.add(wlabel,gbc);
      
      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=1;
      gbc.gridy=0;
      bmiFrame.add(weight,gbc);
      gbc.gridx=2;
      gbc.gridy=0;
      
       bmiFrame.add(hlabel,gbc);
       
      gbc.gridx=3;
      gbc.gridy=0;
      bmiFrame.add(height,gbc);
      
      gbc.fill=GridBagConstraints.HORIZONTAL;
//      gbc.gridx=0;
//      gbc.gridy=2;
//      bmiFrame.add(pressme,gbc);
      gbc.gridx=0;
      
      gbc.gridy=2;
      gbc.gridwidth=0;
//      gbc.weightx=0.5;
//      gbc.weighty=1;
      gbc.insets=new Insets(5,5,5,5);
      bmiFrame.add(calculate,gbc);  
    calculate.addActionListener(this);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=0;
      gbc.gridy=4;
      result.setEditable(false);
      bmiFrame.add(result,gbc);
    
    }
    
    
    
    public static void main(String[] leo)
    {
        new Bmicalc();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
           double h,w,res;
           h=Double.parseDouble(height.getText());
           w=Double.parseDouble(weight.getText());
           //bmiFormula=weightInKg/(heightInMeters)square
           //so as we take height from user in cm because most people know there
           //height in cm so we first convert the height from cm to meter so
           
           h=h/100;
           res=w/(h*h);
           
           result.setText("Result:          your Bm is "+Math.round(res));
        } 
        catch (Exception ex) 
        {
           JOptionPane.showMessageDialog(null, "MissTyping or You press invalid numbers");
        }
    }
}
