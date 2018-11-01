package control;

import model.Player;
//import sun.applet.Main;
import view.Arbeitsplatz;
import view.GamePanelHandler;
import view.MainView;
import view.DealerQuiz;


public class MainController {

    private String rightAnswer;
    //Referenzen
   private Player player;
   private AuftragHandler qh;
   private Arbeitsplatz ap;
   private QuestionHandler th;
   private MainView mV;
   private DealerQuiz dQ;
   private SteuerHandler sh;





    public MainController(){
     qh = new AuftragHandler();
     th = new QuestionHandler();
     sh = new SteuerHandler();

    }

    public void setMainView(MainView mV){
        this.mV = mV;
    }

    public void creatArbeitsplatz(int p){
        ap = new Arbeitsplatz(this,p );
    }
    public int getPlayersteuerLevel(){
        return player.getLevel();
    }
    public void setPlayerQuizLevel(int lvl){
        player.setQuizLevel(lvl);
    }

    public void setPlayersteuerLevel(int level){
        player.setSteuerlevel(level);
    }

    public void creatPlayer(String name){
        player = new Player(name);
    }

    public String getPlayerName(){
        return player.getName();
    }

    public int getPlayerLevel(){
        return player.getLevel();
    }
    public int getQuizLevel(){
        return player.getQuizLevel();
    }


    public String[] getAuftragAndChoices(){
        String[] questions = qh.getRandomChoices(getPlayerLevel());



        String [] output = new String[4];
        for(int i = 0; i < 4;i++){
            output[i] = questions[i];
        }

        return output;
     }
        public String[] getQuestionAndAnswers(){
        String[] questions = th.getRandomQuestion(getQuizLevel());
        rightAnswer = questions[5];


        String [] output = new String[5];
        for(int i = 0; i < 5;i++){
            output[i] = questions[i];
        }

        return output;
    }
    public String getSteuerklärung(){
        if(getPlayerLevel()<=0){
            Sieg();
        }
        String s = sh.getSteuerklärung(getPlayersteuerLevel());
        return s;
    }
    public void Sieg(){
        setPlayersteuerLevel(0);
        setPlayerQuizLevel(0);
    }

    public boolean answer(String chosenAnswer){
        boolean answer = false;
        if(chosenAnswer.equals(rightAnswer) ){
            answer = true;
            player.setQuizLevel(getQuizLevel()+1);
        }
        return answer;
    }
    public void updateMainView(){
        player.setLevel(getPlayerLevel()+1);
        getAuftragAndChoices();
        mV.updateGamePanelHandler();



    }

   public void close(){
        ap.close();
        ap = null;
   }




}
