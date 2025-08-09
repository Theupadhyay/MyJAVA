import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ControlBall
{

    static boolean left, right = true, up, down;
    static public void main(String [] rk)
    {
        JFrame f = new JFrame("Graphics");
        f.setSize(700, 700);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        MyPaintt can = new MyPaintt();
        f.add( can);

        class MyListener extends KeyAdapter
        {
            public void keyPressed(KeyEvent k)
            {
                if(k.getKeyCode() == KeyEvent.VK_LEFT)
                { left = true; right = false; }
                else if(k.getKeyCode() == KeyEvent.VK_RIGHT)
                { left = false; right = !false; }
            }
        }

        can.addKeyListener(new MyListener());
        f.setVisible(true);
    }
}

class MyPaintt extends Canvas
{
    static int x =0, y=0;

    void move()
    {
        if(ControlBall.left) x--;
        else if(ControlBall.right) x++;

        if(x == 650) x = -150;
        if(x == -150) x = 650;
        try {Thread.sleep(5); }
        catch(Exception e) {}
        repaint();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillOval(150+x, 150+ y, 100, 100);
        move();
    }
}