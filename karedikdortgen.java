package javaapplication1;

import java.awt.*;
import javax.swing.*;

public class karedikdortgen extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.BLACK);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.fillRect(350, 50, 150, 100);

        g.setColor(Color.ORANGE);
        int[] xPoints = {550, 600, 650};
        int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 750, 200);

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Times New Roman", Font.BOLD, 24));
        g.drawString("Su Nur ASLAN", 50, 250);

        g.setColor(Color.CYAN);
        g.drawArc(50, 300, 100, 100, 0, 180);

        g.setColor(Color.PINK);
        int[] xPoly = {200, 250, 300, 250};
        int[] yPoly = {300, 250, 300, 350};
        g.fillPolygon(xPoly, yPoly, 4);
    }

    public static void creatShowGUI() {
        JFrame frame = new JFrame("Şekil Çizici");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new karedikdortgen());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                 creatShowGUI();
            }
        });
        
        
    
    }

}
