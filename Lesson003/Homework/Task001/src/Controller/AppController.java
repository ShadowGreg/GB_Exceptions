package Controller;

import Exceptions.AppException;
import Exceptions.ExceptionText;
import View.View;
import View.PromptText;
import core.PersonFillController;

import java.util.Objects;

public class AppController {
    private final View view;
    private final PersonFillController entry;

    public AppController() {
        view = new View();
        entry = new PersonFillController();
    }

    public void run() throws AppException {
        String input = "";
        while (!Objects.equals(input, "EXIT")) {
            try {
                //input = view.enterText(PromptText.fullNameMsg);
                input ="Иванов Иван Иванович";
                setFullName(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
            try {
                input = view.enterText(PromptText.dateMsg);
                entry.setBirthDate(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
            try {
                input = view.enterText(PromptText.phoneNumberMsg);
                entry.setPhoneNumber(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
            try {
                input = view.enterText(PromptText.phoneNumberMsg);
                entry.setGender(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
            try(PersonWriter person = new PersonWriter(entry.getEntry())) {
                person.writePersonToFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new AppException(e.getMessage());
            }
        }
    }

    private void setFullName(String msg) throws AppException {
        String[] splitInput = msg.split(" ");
        verifyWordsCount(splitInput);
        entry.setNme(splitInput[0]);
        entry.setPatronymic(splitInput[1]);
        entry.setLastName(splitInput[1]);
    }

    private boolean verifyWordsCount(String[] splitInput) throws AppException {
        if (splitInput.length==3){
            return true;
        }
        throw new AppException(ExceptionText.wordsCountName);
    }

}





