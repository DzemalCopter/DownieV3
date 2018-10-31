package model;

public class Auftrag {

    private String[] choice;
    private String scenario;


    public Auftrag(String scenario, String[] choice){
        this.scenario = scenario;
        this.choice = choice;

    }

    public String getScenario(){
        return scenario;
    }

    public String[] getChoice(){
        return choice;
    }




}
