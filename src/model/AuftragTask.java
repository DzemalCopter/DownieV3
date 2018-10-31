package model;

public class AuftragTask
{

    private Auftrag[] auftrag;
    private String[] scenario;
    private String question;
    private String correctAnswer;

    public AuftragTask(int level) {
        createAuftrag(level);
    }

    private void createAuftrag(int level){
        scenario = new String[4];
        switch(level){
            case 1: auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Du bist der Boss einer Firma und sitzt an einem schönen, sonnigen Tag in deinem Töten und schaust in die Firmenrechnung. Aufeinmal merkst du, dass dein Manager Geld veruntreut  hat. Was machst du?",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Dein Chef hat zum dritten mal an diesem Tag deinen Kaffee geklaut. Deine Aggression verleitet dich zu...",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                break;
            case 2: auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Du unterhälst dich mit einer Arbeitskollegin und sie 'friendzoned' dich. Du bist traurig. Was willst du tun?",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Dein Kollege verabschiedet sich mit den Worten 'Bruder muss Los', obwohl er weiß, dass er noch eine Steuerklärung machen muss.",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                break;
            case 3: auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Du entdeckst einen korrupten Mitarbeiter in der Firma und der Chef weiß noch nichts davon. Was willst du tun?",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Die Sekretärin hat deinen Namen auf deiner Steuerklärung falsch geschrieben. Du bist wütend und willst...",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                break;
            case 4:
               auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Du siehst einen Mitarbeiter einen Fidget Spinner benutzen. Du gerätst aus allen Fugen und willst ...",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Dein Mitarbeiter spricht Gif falsch aus. Du sagts dem Richter erkläre sich von selber dass ich.. ",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                break;
            case 5:
                auftrag = new Auftrag[2];
                auftrag[0] = new Auftrag("Der größte Lowbob aus der Arbeit wird zum Star-Arbeiter. Eines Tages versucht er dich in die Opfer-Rolle zu bringen.",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
                auftrag[1] = new Auftrag("Ibrahim lacht dich aus...",new String[]{"Töten","Steuerklärung schreiben","Streiten"});
        }
    }

    public Auftrag getRandomAuftrag(){
        int r = (int) (Math.random()* auftrag.length);
        return auftrag[r];
    }
}
