package GridLayout;
import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library

public class GridGalleryy {

    JFrame frame = new JFrame("GridLayout");
    JButton[][] grid; 

    public GridGalleryy(int width, int length) 
    {
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(width, length));
        grid = new JButton[width][length];
    
        for (int y = 0; y < length; y++) {
        
            for (int x = 0; x < width; x++) {
            
                grid[x][y] = new JButton("(" + x + "," + y + ")");
                frame.add(grid[x][y]);
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridGalleryy(3, 3);
    }
}
