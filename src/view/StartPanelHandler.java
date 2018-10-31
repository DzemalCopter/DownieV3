package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler extends JPanel
{
    private JTextField name;
    private JButton startButton;
    private JPanel panel;


    private MainView mainView;
    public StartPanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        startButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                startGameClicked();
            }
        });
    }

    private void startGameClicked(){
        String name = this.name.getText();
        mainView.play(name);
    }

}
