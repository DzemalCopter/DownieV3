package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schießen {
    private JButton schießenButton;
    private JPanel panel;
    private int shoot;
    private Arbeitsplatz ap;
    private MainController mC;

    public Schießen(Arbeitsplatz ap, MainController mC) {
        this.mC = mC;
       this.ap = ap;
        shoot = 0;
        panel.setVisible(true);
        schießenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(shoot==6){
                    JOptionPane.showConfirmDialog(null,"Du hast ihn erfolgreich getötet! Starke Leistung!");
                    mC.updateMainView();
                    ap.dispose();

                }
                shoot = shoot+1;
            }
        });
    }
    public JPanel getPanel(){
        return panel;
    }
}
