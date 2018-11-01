package model;

public class Player {

    private String name;
    private int level;
    private int quizLevel;
    private int steuerlevel;

    public int getSteuerlevel()
    {
        return steuerlevel;
    }

    public void setSteuerlevel(int steuerlevel)
    {
        this.steuerlevel = steuerlevel;
    }

    public Player(String n){
        name = n;
        level = 0;
        quizLevel = 0;
        steuerlevel = 0;
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
