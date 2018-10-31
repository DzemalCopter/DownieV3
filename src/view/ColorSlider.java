package view;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorSlider extends JFrame {

    private JSlider slider1,slider2,slider3;
    private JPanel colorPanel, sliders, labels;
    private JLabel redLabel, greenLabel, blueLabel;


    public ColorSlider(){
        slider1 = new JSlider(JSlider.HORIZONTAL,0,255,0);
        slider2 = new JSlider(JSlider.HORIZONTAL,0,255,0);
        slider3 = new JSlider(JSlider.HORIZONTAL,0,255,0);

        redLabel = new JLabel("Red = 0");
        greenLabel = new JLabel("Green = 0");
        blueLabel = new JLabel("Blue = 0");

        event e = new event();
        slider1.addChangeListener(e);
        slider2.addChangeListener(e);
        slider3.addChangeListener(e);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(1,3,3,3));

        sliders = new JPanel();
        labels = new JPanel();

        pane.add(sliders);
        pane.add(labels);
        pane.add(colorPanel);

        sliders.setLayout(new GridLayout(3,1,2,2));
        sliders.add(slider1);
        sliders.add(slider2);
        sliders.add(slider3);

        labels.setLayout(new GridLayout(3,1,2,2));
        labels.add(redLabel);
        labels.add(greenLabel);
        labels.add(blueLabel);
    }

    public static void main(String[] args) {
        ColorSlider gui = new ColorSlider();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Backgroungcolor Changer");
        gui.setSize(300,110);
        gui.setResizable(false);
    }

    public class event implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int r = slider1.getValue();
            int g = slider2.getValue();
            int b = slider3.getValue();

            redLabel.setText("Red = "+r);
            greenLabel.setText("Green = "+g);
            blueLabel.setText("Blue =  "+b);

            colorPanel.setBackground(new Color(r,g,b));
        }
    }

}
