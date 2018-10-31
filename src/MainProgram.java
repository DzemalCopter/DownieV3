import control.MainController;
import view.MainView;

public class MainProgram {



    public static void main(String[] args)
    {
        MainController mC = new MainController();
        MainView mV = new MainView(mC);
        mC.setMainView(mV);


    }
}
