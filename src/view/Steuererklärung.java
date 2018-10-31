package view;

import javax.swing.*;

public class Steuererklärung extends JPanel
{
    private Arbeitsplatz ap;
    private JPanel panel;


    public Steuererklärung(Arbeitsplatz ap)
    {
        this.ap = ap;
    }

    public JPanel getPanel()
    {
        return panel;
    }
}
