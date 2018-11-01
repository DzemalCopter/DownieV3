package control;

import model.Steuerklärung;
import model.Steuervarianten;

public class SteuerHandler
{
    private Steuervarianten[] sv;

    public SteuerHandler()
    {
        sv = new Steuervarianten[3];
        createStuervarianten();
    }

    public void createStuervarianten(){
        for (int i = 0; i < 3; i++){
            sv[i] = new Steuervarianten(i +1);
        }
    }
    public String getSteuerklärung(int level){
        Steuerklärung s = sv[level].getRandomSteuerklärung();
        String out = s.getName();
        return out;
    }


}
