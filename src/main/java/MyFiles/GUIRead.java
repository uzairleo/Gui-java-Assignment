package MyFiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

public class GUIRead implements ActionListener {

    JFrame frame = new JFrame("GUI Read");
    JTextArea area = new JTextArea(10, 20);
    JScrollPane pane = new JScrollPane(area);
    JButton overwrite = new JButton("Overwrite");
    JButton browse = new JButton("Browse");
    JButton save = new JButton("Save");
    JButton reset = new JButton("Reset");
    JButton count = new JButton("Count");
    
    JFileChooser chooser;
    public GUIRead() {
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(browse);
        frame.add(overwrite);
        frame.add(save);
        frame.add(reset);
        frame.add(pane);
        
        frame.add(count);
        
        browse.addActionListener(this);
        save.addActionListener(this);
        reset.addActionListener(this);
        overwrite.addActionListener(this);
        count.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUIRead();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browse) {
            System.out.println("reaced...");
//            JFileChooser chooser = new JFileChooser("D:");
            chooser = new JFileChooser(FileSystemView.getFileSystemView());
            int d = chooser.showOpenDialog(null);
            if (d == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getAbsolutePath();
                try {
                    File myObj = new File(path);
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        area.setText(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("An error occurred.");
                }
            } else if (d == JFileChooser.CANCEL_OPTION) {
                System.out.println("Cancled ..");
            }
        } else if (e.getSource() == save) {
            JFileChooser saveChooser = new JFileChooser();
            int d = saveChooser.showSaveDialog(null);
            if (d == JFileChooser.APPROVE_OPTION) {
                String data = area.getText();
                String path = saveChooser.getSelectedFile().getAbsolutePath();
                try {
                    FileWriter myWriter = new FileWriter(path);
                    // Writes this content into the specified file
                    myWriter.write(data);
                    // Closing is necessary to retrieve the resources allocated
                    myWriter.close();
                    JOptionPane.showMessageDialog(null, "Successfully wrote to the file.");
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                }
            } else if (d == JFileChooser.CANCEL_OPTION) {

            }
        } else if (e.getSource() == reset) {
            area.setText("");
        } 
        else if (e.getSource() == overwrite) 
        {
            String data = area.getText();
            String path = chooser.getSelectedFile().getAbsolutePath();
            try {
                FileWriter myWriter = new FileWriter(path);
                // Writes this content into the specified file
                myWriter.write(area.getText() + data);
                // Closing is necessary to retrieve the resources allocated
                myWriter.close();
                JOptionPane.showMessageDialog(null, "Successfully wrote to the file.");
            } catch (IOException ex) {
                System.out.println("An error occurred.");
            }
        }
        else if(e.getSource() == count)
        {
           // count number of sentences
            // words
            // vowels
            // consonents
            // paragraphs
        }
    }
}
