package model;

public class Player {

    private String name;
    private int level;
    private int quizLevel;

    public Player(String n){
        name = n;
        level = 0;
        quizLevel = 0;
    }

    public  String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    public int getQuizLevel() {
        return quizLevel;
    }

    public void setQuizLevel(int quizLevel) {
        this.quizLevel = quizLevel;
    }
}
