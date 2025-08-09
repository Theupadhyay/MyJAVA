import java.awt.*;
import javax.swing.*;

class GraphicsDemo42 {
    static public void main(String[] rk) {
        JFrame f = new JFrame("Graphics");
        f.setSize(700, 700);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.add(new MyPaint());
        f.setVisible(true);
    }
}

class MyPaint extends Canvas {

    public void paint(Graphics g) {
        g.setColor(new Color(60, 117, 25));
        g.fillOval(100, 100, 150, 100);

        g.setColor(Color.RED);
        g.fillRect(400, 100, 300, 200);

        g.setColor(Color.blue);
        g.fillArc(150, 150, 150, 150, 150, 60);

        g.setColor(Color.blue);
        g.fillOval(150, 150, 100, 300);
    }
}