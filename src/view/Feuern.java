package view;

import javax.swing.*;

public class Feuern extends JPanel
{


    private JPanel panel;
    private Arbeitsplatz ap;

    public Feuern(Arbeitsplatz ap)
    {
        this.ap = ap;
    }

    public JPanel getPanel()
    {
        return panel;
    }
}
