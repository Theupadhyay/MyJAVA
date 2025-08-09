import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NotePad {
    public static void main(String... Au) {
        JFrame f = new JFrame("Note Pad");
        f.setSize(700, 700);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.DARK_GRAY);


        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);

        Font fnt = new Font("Serif", 1, 10); // style 0 = plane , 1 = bold , 2 = Italic , 3 = bold+Italic


        JMenuBar jmb = new JMenuBar();
        f.setJMenuBar(jmb);
        jmb.setLayout(f1);

        JMenu M1 = new JMenu("File");
        JMenu M3 = new JMenu("Edit");
        JMenu M2 = new JMenu("View");
        jmb.add(M1);
        jmb.add(M2);
        jmb.add(M3);

        JMenuItem m11 = new JMenuItem("Open");
        M1.add(m11);     m11.setFont(new Font("Abhi" , 1 , 10));
        JMenuItem m12 = new JMenuItem("Save");
        M1.add(m12);     m12.setFont(new Font("Abhi" , 1 , 10));
        JMenuItem m13 = new JMenuItem("Save As");
        M1.add(m13);      m13.setFont(new Font("Abhi" , 1 , 10));
        JMenuItem m14 = new JMenuItem("Exit");
        M1.add(m14);     m14.setForeground(Color.GRAY);   m14.setFont(new Font("Abhi" , 1 , 10));

        //Sub menu
        JMenu Zoom = new JMenu("Zoom");
        JMenuItem zin = new JMenuItem("Zoom In");
        JMenuItem zout = new JMenuItem("Zoom Out");
        M3.add(Zoom);
        Zoom.add(zin);
        Zoom.add(zout);
        Zoom.setFont(fnt);
        zin.setFont(fnt);
        zout.setFont(fnt);

        M1.insertSeparator(2);

        // Register the Listner
        class MyListner implements ActionListener{
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == m11){
                    JFileChooser fc = new JFileChooser();
                    fc.showOpenDialog(f);
                }
            }
        }
        m11.addActionListener(new MyListner());

        // view menu

        JMenuItem m31 = new JMenuItem("Word Wrap");
        M3.add(m31);
        JCheckBoxMenuItem m32 = new JCheckBoxMenuItem("Status Bar", true);
        M2.add(m32);
        M3.add(m31);
        m32.setFont(fnt);
        m31.setFont(fnt);

        f.setVisible(true);

    }
}
