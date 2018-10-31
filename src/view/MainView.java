package view;

import control.MainController;

import javax.swing.*;

public class MainView extends JFrame {


    MainController mainController;
    private JPanel startPanel,gamePanel;
    private GamePanelHandler gamePanelHandler;



    public MainView(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("TellKosAdventure");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void  play(String name) {
        mainController.creatPlayer(name);
        String noName = "";
        if (name.equals(noName)) {
            int choice = JOptionPane.showOptionDialog(null,
                    "Gib einen Namen ein!",
                    "Dumm?",JOptionPane.OK_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, null, null);


        }else {

            this.getContentPane().removeAll();
            this.getContentPane().invalidate();

            this.gamePanelHandler = new GamePanelHandler(mainController, mainController.getPlayerName(), mainController.getPlayerLevel());
            this.gamePanel = gamePanelHandler.getPanel();

            this.getContentPane().add(gamePanel);
            this.getContentPane().revalidate();

        }


    }
    public void updateGamePanelHandler(){
        this.gamePanelHandler.updateButtons();
    }



}
