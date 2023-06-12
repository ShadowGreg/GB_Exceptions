import Controller.AppController;
import Exceptions.AppException;

public class Main {
    public static void main(String[] args) throws AppException {

        AppController appController = new AppController();
        appController.run();

    }
}