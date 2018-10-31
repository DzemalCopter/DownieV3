package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schießen {
    private JButton schießenButton;
    private JPanel panel1;
    private int shoot;

    public Schießen() {
        shoot = 0;
        panel1.setVisible(true);
        schießenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(shoot==6){
                    JOptionPane.showConfirmDialog(null,"Du hast ihn erfolgreich getötet! Starke Leistung!");
                }
                shoot = shoot+1;
            }
        });
    }
}
