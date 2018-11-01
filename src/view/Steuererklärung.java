package view;

import control.MainController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.zip.InflaterInputStream;

public class Steuererklärung extends JPanel
{

    private Arbeitsplatz ap;
    private JPanel panel;
    private JLabel label;
    private JTextArea aufgabe;
    private JTextArea antwort;
    private JButton ok;
    private JTextField moderator;
    private MainController mC;
    private int chance;
    private BufferedImage image;
    private int level;


    public Steuererklärung(Arbeitsplatz ap, MainController mC)
    {
        level = 0;
        chance = 3;
        this.mC = mC;
        this.ap = ap;
        updateButtons();

        ok.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                feedback();
            }
        });
    }

    public JPanel getPanel()
    {
        return panel;
    }

    public void updateButtons()
    {
        mC.setPlayersteuerLevel(mC.getPlayersteuerLevel() + 1);
        level = level +1;

        if (level <= 3)
        {
            aufgabe.setText(mC.getSteuerklärung());
            antwort.setText(null);
        } else
        {
            ok.setEnabled(false);
            label.setText("gewonnen!");
            mC.Sieg();
            mC.close();

        }
    }




        public void feedback() {
        if (aufgabe.getText().equals(antwort.getText()))
        {

            updateButtons();
        } else
        {
            chance = chance - 1;
            moderator.setText("Falsch, sie haben noch "+ chance+"  Chance(n)!!");

        }
        if(chance<=0){
            ap.lose();
        }
    }



}
