package core;

import Exceptions.AppException;
import Exceptions.ExceptionText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryFillController {
    private Entry entry;

    public Entry getEntry() {
        return entry;
    }

    private boolean VerifyEntryFromFullName(String name) {
        return containsDigitsOrSpecialChars(name);
    }

    private static boolean containsDigitsOrSpecialChars(String input) {
        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]");
        Matcher matcher = pattern.matcher(input);
        return !matcher.find();
    }

    private boolean  fillEntryFromFullName(String nameText, String exceptionText) throws AppException {
        if (VerifyEntryFromFullName(nameText)) {
            entry.name = nameText;
            return true;
        }
        throw new AppException(exceptionText);
    }

    public boolean setNme(String name) throws AppException {
        return fillEntryFromFullName(name,ExceptionText.name);
    }

    public boolean setSurname(String surname) throws AppException{
        return fillEntryFromFullName(surname,ExceptionText.surname);
    }
}
