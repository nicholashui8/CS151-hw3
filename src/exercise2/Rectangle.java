package exercise2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends JPanel {
    private int height1;
    private int height2;
    private int height3;

    public Rectangle(int height1, int height2, int height3) {
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = height3;

        this.setPreferredSize(new Dimension(500, 500));
    }

    //set new height for each triangle
    public void newHeights(int height1, int height2, int height3) {
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = height3;
    }

    //paints the 3 triangles
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //new Rec(x , y, width, height)
        Rectangle2D rect1 = new Rectangle2D.Double(10, 500 - height1, 75, height1);
        g2.setColor(Color.red);
        g2.fill(rect1);
        g2.draw(rect1);

        Rectangle2D rect2 = new Rectangle2D.Double(110, 500 - height2, 75, height2);
        g2.setColor(Color.blue);
        g2.fill(rect2);
        g2.draw(rect2);

        Rectangle2D rect3 = new Rectangle2D.Double(210, 500 - height3, 75, height3);
        g2.setColor(Color.green);
        g2.fill(rect3);
        g2.draw(rect3);
    }
}
