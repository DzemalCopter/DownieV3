package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DealerQuiz extends JPanel
{
    private JTextArea questionArea;
    private JButton answerA;
    private JButton answerD;
    private JButton answerC;
    private JButton answerB;
    private JPanel panel;
    private JTextField moderator;
    private MainController mc;
    private Arbeitsplatz ap;
    private Schießen schießen;
    private int chance;




    public DealerQuiz(MainController mc, Arbeitsplatz ap)
    {
        chance = 3;
        this.mc = mc;
        this.ap = ap;


        updateQuestionsAndAnswers();

        createButtons();

    }

    private void createButtons(){
        answerA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("A");





            }
        });
        answerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("B");


            }
        });
        answerC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                feedback("C");


            }
        });
        answerD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback("D");

            }
        });
    }
    public void feedback(String ans){
        if(mc.answer(ans) == true  )
        {

            updateQuestionsAndAnswers();


        }else{  chance = chance - 1;
            moderator.setText("Falsch, sie haben noch "+ chance+"  Chancen!!");

        }
        if(chance<=0){
            ap.lose();
        }
    }

    public void updateQuestionsAndAnswers() {
            int level= mc.getQuizLevel();
            if(level<=4) {
                String[] answerAndQuestions = mc.getQuestionAndAnswers();

                questionArea.setText(answerAndQuestions[0]);
                answerA.setText(answerAndQuestions[1]);
                answerB.setText(answerAndQuestions[2]);
                answerC.setText(answerAndQuestions[3]);
                answerD.setText(answerAndQuestions[4]);

            }
            else {
                answerA.setEnabled(false);
                answerB.setEnabled(false);
                answerC.setEnabled(false);
                answerD.setEnabled(false);
                mc.Sieg();
                ap.schießen();




            }
    }


    public JPanel getPanel()
    {
        return panel;
    }



}
