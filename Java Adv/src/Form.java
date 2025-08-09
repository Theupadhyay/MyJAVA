import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form {
    public static void main(String... AU) {
        JFrame j = new JFrame();
        j.setSize(600,800);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setLayout(new FlowLayout());
        j.getContentPane().setBackground(Color.GRAY);

        System.out.println("Set Your Games Prefrence");

        JTextField Text = new JTextField("Write your Opinion Upon your select");


        JCheckBox Cb1 = new JCheckBox("Golf");
        JCheckBox Cb2 = new JCheckBox("Hockey");
        JCheckBox Cb3 = new JCheckBox("Cricket");
        j.add(Cb1);
        j.add(Cb3);
        j.add(Cb2);


        j.setVisible(true);
    }
}
