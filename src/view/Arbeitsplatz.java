package view;

import control.MainController;

import javax.swing.*;

public class Arbeitsplatz extends JFrame
{
    private MainController mC;
    private int pan;
    private JPanel töten,steuerklärung,feuern,dealerQuiz,schießen;

    public Arbeitsplatz(MainController mainController,int pan) {



        this.setLocation(1050,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("Arbeitsplatz");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        mC = mainController;
        this.pan = pan;

        dealerQuiz = new DealerQuiz(mC,this).getPanel();
        töten = new Töten(this).getPanel();
        steuerklärung = new Steuererklärung(this).getPanel();
        feuern = new Feuern(this).getPanel();
        schießen = new Schießen(this,mC).getPanel();


        update(pan);
    }
    public void update(int pan){
        switch (pan){
            case 1:
                this.getContentPane().removeAll();
                this.getContentPane().invalidate();
                this.setContentPane(töten);
                this.getContentPane().revalidate();
                break;
            case 2:
                this.getContentPane().removeAll();
                this.getContentPane().invalidate();
                this.setContentPane(steuerklärung);
                this.getContentPane().revalidate();
                break;
            case 3:
                this.getContentPane().removeAll();
                this.getContentPane().invalidate();
                this.setContentPane(feuern);
                this.getContentPane().revalidate();
                break;

        }
    }

    public void playQuiz(){
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        this.setContentPane(dealerQuiz);
        this.getContentPane().revalidate();
    }
    public void schießen(){
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        this.setContentPane(schießen);
        this.getContentPane().revalidate();
    }
    public void close(){
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();
        mC.updateMainView();
        this.dispose();

    }


}
