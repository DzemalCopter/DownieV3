package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Töten extends JPanel
{
    private JPanel panel;
    private JTextArea textArea1;
    private JButton aufDemTischButton;
    private JButton imSchrankButton;
    private JButton amPc;
    private Arbeitsplatz ap;
    private boolean found;
    private int right;
    private int tisch,schrank,computer;
    private int random;


    public Töten(Arbeitsplatz ap) {
        right = 0;
        this.ap = ap;
        random = (int) Math.random() * 4 + 1;
        if (random == 1) {
            tisch = 3;
            schrank = 2;
            computer = 1;
        }
        if (random == 2) {
            tisch = 1;
            schrank = 2;
            computer = 3;
        }
        if (random == 3) {
            tisch = 1;
            schrank = 3;
            computer = 2;
        }






        aufDemTischButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            right = tisch;
            Check();
            geheZumDealer();

            }
        });
        imSchrankButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                right = schrank;
                Check();
                geheZumDealer();

            }
        });
        amPc.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                right = computer;
                Check();
                geheZumDealer();

            }
        });
    }
    public boolean Check(){
        if (right == 3){
            found = true;
        }
        return found;
    }
    public void geheZumDealer(){

        if( Check() == true){
            textArea1.setText("Ja ich habe das Blatt gefunden. Ab gehts zum Dealer.");
            ap.playQuiz();

        }else{
            right = 0;
            found = false;
        }
    }

    public JPanel getPanel(){
        return panel;
    }




}
