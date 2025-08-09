import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Windmill extends JFrame {

    private JPanel panel;
    private Timer timer;
    private int angle;

    public Windmill() {
        super("Windmill");

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawWindmill(g);
            }
        };
        panel.setBackground(Color.WHITE);

        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angle = (angle + 5) % 360; // Rotate by 5 degrees on each tick
                repaint();
            }
        });

        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        timer.start();
    }

    private void drawWindmill(Graphics g) {
        int centerX = panel.getWidth() / 2;
        int centerY = panel.getHeight() / 2;
        int radius = Math.min(panel.getWidth(), panel.getHeight()) / 4;

        // Draw windmill blades
        g.setColor(Color.BLACK);
        for (int i = 0; i < 4; i++) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.rotate(Math.toRadians(angle + i * 90), centerX, centerY);
            g2d.fillRect(centerX - 10, centerY - radius, 20, 2 * radius);
            g2d.dispose();
        }

        // Draw windmill hub
        g.setColor(Color.DARK_GRAY);
        g.fillOval(centerX - 15, centerY - 15, 30, 30);

        // for pole
        g.setColor(Color.GRAY);
        g.fillRect(centerX -5, centerY , 10, radius +80); //centerY - radius - 20
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Windmill());
    }
}
