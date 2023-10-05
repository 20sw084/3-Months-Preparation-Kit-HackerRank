import java.awt.*;
import java.awt.event.*;

public class AdapterExample {
    // object of Frame
    Frame f;
    // class constructor
    AdapterExample() {
// creating a frame with the title
        f = new Frame ("Window Adapter");
// adding the WindowListener to the frame
// overriding the windowClosing() method
        f.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                f.dispose();
            }
        });
        // setting the size, layout and
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible (true);
    }

    // main method
    public static void main(String[] args) {
        new AdapterExample();
    }
}