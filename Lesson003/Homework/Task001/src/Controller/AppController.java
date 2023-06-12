package Controller;

import Exceptions.AppException;
import Exceptions.ExceptionText;
import View.View;
import View.PromptText;
import core.EntryFillController;

import java.util.Objects;

public class AppController {
    private final View view;
    private final EntryFillController entry;

    public AppController() {
        view = new View();
        entry = new EntryFillController();
    }

    public void run() throws AppException {
        String input = "";
        while (!Objects.equals(input, "EXIT")) {
            try {
                input = view.enterText(PromptText.fullNameMsg);
                SetFullName(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
            try {
                input = view.enterText(PromptText.fullNameMsg);
                SetFullName(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
        }
    }

    private void SetFullName(String msg) throws AppException {
        String[] splitInput = msg.split(" ");
        Verify(splitInput);
        entry.setNme(splitInput[0]);
        entry.setPatronymic(splitInput[1]);
        entry.setLastName(splitInput[1]);
    }

    private boolean Verify(String[] splitInput) throws AppException {
        if (splitInput.length==3){
            return true;
        }
        throw new AppException(ExceptionText.wordsCountName);
    }

}





