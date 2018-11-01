package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public Steuererklärung(Arbeitsplatz ap, MainController mC)
    {
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
        mC.setPlayersteuerLevel(mC.getPlayersteuerLevel()+1);
        int level = mC.getPlayersteuerLevel();
        if (level <= 3)
        {
            aufgabe.setText(mC.getSteuerklärung());
            antwort.setText(null);
        } else
        {
            ok.setEnabled(false);
            label.setText("gewonnen!");

        }
    }

        public void feedback() {
        if (aufgabe.getText().equals(antwort.getText()))
        {

            updateButtons();
        } else
        {
            moderator.setText("Falsch, sie haben noch "+ chance+"  Chancen!!");
            chance = chance - 1;
        }
        if(chance<=0){
            System.exit(0);
        }
    }



}