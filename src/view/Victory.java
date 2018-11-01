package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Victory
{
    private JPanel panel;
    private JButton yayyDDDDButton;
    private Arbeitsplatz ap;
    private MainController mC;

    public Victory(Arbeitsplatz ap, MainController mC)
    {
        this.ap = ap;
        this.mC = mC;

        yayyDDDDButton.addActionListener(new ActionListener()
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
