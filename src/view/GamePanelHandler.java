package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanelHandler extends JPanel
{

    private JTextArea textArea1;
    private JPanel tKA;
    private JLabel name;
    private JLabel level;
    private JButton töten;
    private JButton feuern;
    private JButton steuer;
    private JButton colorslider;
    private MainController mC;
    private String playerName;
    private int playerlevel;

    public GamePanelHandler(MainController mC, String playername, int level){
        this.mC = mC;
        ColorSlider cs = new ColorSlider();
        this.playerlevel = level;
        playerName = playername;
        updateButtons();


        töten.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mC.creatArbeitsplatz(1);
                töten.setEnabled(false);
                steuer.setEnabled(false);
                feuern.setEnabled(false);

            }
        });
        steuer.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mC.creatArbeitsplatz(2);
                töten.setEnabled(false);
                steuer.setEnabled(false);
                feuern.setEnabled(false);
            }

        });
        feuern.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mC.creatArbeitsplatz(3);
                töten.setEnabled(false);
                steuer.setEnabled(false);
                feuern.setEnabled(false);
            }
        });
    }

    public void updateButtons(){
        töten.setEnabled(true);
        steuer.setEnabled(true);
        feuern.setEnabled(true);
        String[] s = mC.getAuftragAndChoices();
        textArea1.setText(s[0]);
         töten.setText(s[1]);
        steuer.setText(s[2]);
        feuern.setText(s[3]);
        name.setText(playerName);
        level.setText("" + playerlevel);
    }


    public void updatePictureFrame(){

    }
    public JPanel getPanel(){
        return tKA;
    }
}
