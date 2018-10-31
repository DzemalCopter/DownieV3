package control;

import model.LevelQuestions;
import model.Question;

public class QuestionHandler {

    private LevelQuestions[] allLevelQuestions;

    public QuestionHandler(){
        allLevelQuestions = new LevelQuestions[5];
        createAllLevels();

    }

    private void createAllLevels(){
        for(int i=0; i < allLevelQuestions.length; i++){
            allLevelQuestions[i] = new LevelQuestions(i+1);
        }
    }


    public String[] getRandomQuestion(int level){
        LevelQuestions lq = allLevelQuestions[level];
        Question question = lq.getRandomQuestion();
        String[] output = new String[6];
        output[0] = question.getQuestion();
        output[1] = question.getAnswers()[0];
        output[2] = question.getAnswers()[1];
        output[3] = question.getAnswers()[2];
        output[4] = question.getAnswers()[3];
        output[5] = question.getCorrectAnswer();
        
        return output;
    }
}
