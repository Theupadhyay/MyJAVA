import javax.swing.*;
import java.awt.*;

public class JScrollPane {
    

    public static void main(String[] Au) {
        JFrame f = new JFrame();
        f.setSize(600, 800);
        f.setLayout(new FlowLayout());
        JTextArea ta = new JTextArea("Write your Query", 10, 10);
//        JScrollPane jsp = new JScrollPane(ta);
//        jsp.setHorizontalScrollBarPolicy();
//        ta.setLineWrap(true);
//        f.add(jsp);


        f.setVisible(true);
    }
}
