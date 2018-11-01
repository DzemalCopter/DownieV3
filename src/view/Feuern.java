package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Feuern extends JPanel
{


    private JPanel panel;
    private JButton schereButton;
    private JButton steinButton;
    private JButton papierButton;
    private JTextArea arena;
    private JLabel deinepoints;
    private JLabel enemypoints;
    private JLabel n;
    private Arbeitsplatz ap;
    private MainController mC;
    private int mypoints;
    private int hispoints;
    private int schere, stein, papier;

    public Feuern(Arbeitsplatz ap, MainController mC)
    {
        schere = 1;
        stein = 2;
        papier = 3;
        this.mC = mC;
        this.ap = ap;


        papierButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                play(3);
                Check();
            }
        });

        steinButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                play(2);
                Check();
            }
        });

        schereButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                play(1);
                Check();
            }
        });
    }





    public JPanel getPanel()
    {
        return panel;
    }


    public void play(int i){
        int pcWahl =(int) Math.random()*3;
        if(i == schere)
        {
            if (i == pcWahl)
            {
                arena.setText("Du: Schere   Gegner: Schere" +
                        "   Unentschieden :/");
            } else if (pcWahl == stein)
            {
                hispoints = hispoints + 1;
                enemypoints.setText("" + hispoints);
                arena.setText("Du: Schere   Gegner: Stein" +
                        "     Punkt für die :´(");
            } else if (pcWahl == papier)
            {
                mypoints = mypoints + 1;
                deinepoints.setText("" + mypoints);
                arena.setText("Du: Schere   Gegner: Papier" +
                        "     Punkt für dich >:D ");
            }
        }
            if(i == stein){
                if(i ==pcWahl){
                    arena.setText("Du: Stein   Gegner: Stein" +
                            "   Unentschieden :/" );
                }else if(pcWahl == papier){
                    hispoints = hispoints + 1;
                    arena.setText("Du: Stein   Gegner: Papier" +
                            "     Punkt für die :´(");
                    enemypoints.setText(""+hispoints);
                }else if(pcWahl == schere){
                    mypoints = mypoints + 1;
                    deinepoints.setText(""+mypoints);
                    arena.setText("Du: Stein   Gegner: Schere" +
                            "     Punkt für dich >:D ");
                }
            }
        if(i == papier){
            if(i ==pcWahl){
                arena.setText("Du: Papier   Gegner: Papiert" +
                        "   Unentschieden :/" );
            }else if(pcWahl == schere){
                hispoints = hispoints + 1;
                arena.setText("Du: Papier   Gegner: schre" +
                        "     Punkt für die :´(");
                enemypoints.setText(""+hispoints);
            }else if(pcWahl == stein){
                mypoints = mypoints + 1;
                deinepoints.setText(""+mypoints);
                arena.setText("Du: Papier   Gegner: Stein" +
                        "     Punkt für dich >:D ");
            }

        }
    }
    public void Check(){
        if(hispoints>=3){
            JOptionPane.showMessageDialog(null,"Du hast verloren!");
            ap.lose();
        }
        if(mypoints>=3){
            JOptionPane.showMessageDialog(null,"Du hast ihn erfolgreich besiegt! Starke Leistung!");

            mC.close();
        }
    }


}

