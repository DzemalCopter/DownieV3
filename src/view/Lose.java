package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lose
{
    private JPanel panel;
    private JButton okButton;
    private Arbeitsplatz ap;
    private MainController mC;

    public Lose(Arbeitsplatz ap, MainController mC)
    {
        this.ap = ap;
        this.mC = mC;

        okButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }
}
