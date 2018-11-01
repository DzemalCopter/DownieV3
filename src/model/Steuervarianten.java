package model;

import view.Steuererklärung;

import javax.swing.*;

public class Steuervarianten
{
    Steuerklärung[] steuerklärung;

    public Steuervarianten(int level)
    {

        createSteuererklärung(level);
    }

    public void createSteuererklärung(int level)
    {

        switch (level)
        {
            case 1:
                steuerklärung = new Steuerklärung[2];
                steuerklärung[0] = new Steuerklärung("Wie hält man eine Waffe?");
                steuerklärung[1] = new Steuerklärung("Der Herr Aldumi");

                break;
            case 2:
                steuerklärung = new Steuerklärung[2];
                steuerklärung[0] = new Steuerklärung("Wie hält man eine Waffe?");
                steuerklärung[1] = new Steuerklärung("Der Herr Aldumi");

                break;
            case 3:
                steuerklärung = new Steuerklärung[2];
                steuerklärung[0] = new Steuerklärung("Wie hält man eine Waffe?");
                steuerklärung[1] = new Steuerklärung("Der Herr Aldumi");

                break;

        }
    }

    public Steuerklärung getRandomSteuerklärung()
    {

        int r = (int) (Math.random() * steuerklärung.length);
        return steuerklärung[r];
    }
}
