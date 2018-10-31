package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyTextArea extends JTextArea {
    private Image elevator;
    private Image office1;

    public MyTextArea(int a, int b) {
        super(a,b);
        try{
            elevator = ImageIO.read(new File("D:\\IntelliJ projekte\\TextAdventure\\Bilder\\fahrstuhl.jpg"));
            office1 = ImageIO.read(new File("D:\\IntelliJ projekte\\TextAdventure\\Bilder\\büro1.png"));
        } catch(IOException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(elevator,0,0,null);
        super.paintComponent(g);
    }

}
