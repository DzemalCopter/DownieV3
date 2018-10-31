package model;

public class LevelQuestions {

    private Question[] questions;
    private String[] answers;
    private String question;
    private String correctAnswer;

    public LevelQuestions(int level) {
        createQuestions(level);
    }

    private void createQuestions(int level){
        answers = new String[4];
        switch(level){
            case 1: questions = new Question[2];
                questions[0] = new Question("Wie hält man eine Waffe?",new String[]{"Mit den Füßen","Mit dem Mund","Mit den Händen","Garnicht"},"C" );
                questions[1] = new Question("Welche der hier genannten Gegen stände sind Schusswaffen im Sinne des Waffengesetzes? ",new String[]{"Blasrohr","Druckluftgewehr mit Zulassungszeichen „F im Fünfeck“","Doppelflinte","C4"},"B" );
                break;
            case 2: questions = new Question[3];
                questions[0] = new Question("Welche der hier aufgelisteten Waffen ist eine halbautomatische Schusswaffe?",new String[]{"Revolver","Selbstladepistole","Deutschland","Mexico"},"B" );
                questions[1] = new Question("In welchem Bundesland liegt Freiburg?",new String[]{"Mallorca","Bayern","Baden-Württemberg","Deutschland"},"C" );
                questions[2] = new Question("Wann fand die Völkerschlacht von Leipzig statt? ",new String[]{"1813","1933","2009","1412"},"A" );
                break;
            case 3: questions = new Question[1];
                questions[0] = new Question("Welche Säure ist HCL",new String[]{"Salpetersäure","Schwefelsäure","Salzsäure","Ameisensäure"},"C" );

                break;
            case 4:
               questions = new Question[2];
                questions[0] = new Question("Wo fanden die olympischen Winterspiele 2018 statt? ",new String[]{"Tokyo","Kuala Lumpur","Stalingrad","Pyeongchang "},"D" );
                questions[1] = new Question("Bei welchem Elektronegativitätswert findet eine polare Bindung statt ",new String[]{">0,4","<1,7",">1,7","1,5 "},"A" );
                break;
            case 5:
                questions = new Question[1];
                questions[0] = new Question("Wer hat TelCO Adventures programmiert? ",new String[]{"Keiner"," Arujan, Henri, Tobias","Nur Ibrahim mit einer Hand"," Arujan, Henri, Tobias, ibrahim"},"D" );


        }
    }

    public Question getRandomQuestion(){
        //Typecast: Java wird aufgefordert, aus einem Datentypen
        //          einen anderen zu machen. Hierbei wird eine
        //          Dezimalzahl "hart" abgerundet. D.h, aus
        //          5.87 wird 5.
        int r= (int) (Math.random()*questions.length);
        return questions[r];
    }
}
