package model;

public class Question{

    private String[] answer;
    private String question;
    private String correctAnswer;

    public Question(String question, String[] answer, String correctAnswer){
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String[] getAnswers(){
        return answer;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }


}
