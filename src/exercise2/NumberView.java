package exercise2;

import javax.swing.*;
import java.awt.*;

public class NumberView {
    Model model;

    public NumberView(Model model) {
        this.model = model;
        JFrame numberFrame = new JFrame();
        numberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JPanel panel = new JPanel();
        numberFrame.setLayout(new GridLayout(4, 2));
        //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        final int FIELD_WIDTH = 20;

        //create textfield so user can adjust rectangle height
        JTextField firstField = new JTextField(FIELD_WIDTH);
        JTextField secondField = new JTextField(FIELD_WIDTH);
        JTextField thirdField = new JTextField(FIELD_WIDTH);
        JButton updateButton = new JButton("Update");
        firstField.setText("100");
        secondField.setText("100");
        thirdField.setText("100");

        //add text fields to frame
        numberFrame.add(new JLabel("Red"));
        numberFrame.add(firstField);
        numberFrame.add(new JLabel("Blue"));
        numberFrame.add(secondField);
        numberFrame.add(new JLabel("Green"));
        numberFrame.add(thirdField);
        numberFrame.add(updateButton);

        //update button listens for click
        updateButton.addActionListener(e -> {
            //get height from each textfield
            int height1 = Integer.parseInt(firstField.getText());
            int height2 = Integer.parseInt(secondField.getText());
            int height3 = Integer.parseInt(thirdField.getText());
            //tell model to upadate with given heights
            model.update(height1, height2, height3);
        });

        //set window properties
        numberFrame.pack();
        numberFrame.setVisible(true);
    }
}
