package control;

import model.Auftrag;
import model.AuftragTask;

public class AuftragHandler
{

    private AuftragTask[] allLevels;

    public AuftragHandler(){
        allLevels = new AuftragTask[5];
        createAllLevels();

    }

    private void createAllLevels(){
        for(int i=0; i < allLevels.length; i++){
            allLevels[i] = new AuftragTask(i+1);
        }
    }


    public String[] getRandomChoices(int level){
        AuftragTask lq = allLevels[level];
        Auftrag auftrag = lq.getRandomAuftrag();
        String[] output = new String[4];
        output[0] = auftrag.getScenario();
        output[1] = auftrag.getChoice()[0];
        output[2] = auftrag.getChoice()[1];
        output[3] = auftrag.getChoice()[2];



        return output;
    }
}
