package exercise2;

import javax.swing.*;
import java.awt.*;

public class GraphView extends JFrame {

    Rectangle rectangle;

    public GraphView() {
        
        //set window properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //create Reatangle object and set the default height of the three rectangles to 100
        this.rectangle = new Rectangle(100, 100, 100);

        //add Rectangle to current JFrame
        this.add(rectangle);

        //set window properties
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //gets called whenever user clicks "update" button: repaints rectangles
    public void updateGraph(int height1, int height2, int height3) {
        System.out.println("updating graph from GraphView");
        //sets the new heights of the triangle
        this.rectangle.newHeights(height1, height2, height3);
        //repaint rectangles
        this.repaint();
    }


}
