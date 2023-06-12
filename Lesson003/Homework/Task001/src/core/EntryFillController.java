package core;

import Exceptions.AppException;
import Exceptions.ExceptionText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryFillController {
    private final Entry entry;

    private enum EntryFromFullName {
        NAME,
        PATRONYMIC,
        LASTNAME
    }

    ;

    public EntryFillController() {
        entry = new Entry();
    }

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

    private boolean fillEntryFromFullName(String nameText, String exceptionText, EntryFromFullName inNamePart) throws AppException {

        if (VerifyEntryFromFullName(nameText)) {
            switch (inNamePart) {
                case NAME -> entry.name = nameText;
                case LASTNAME -> entry.lastNme = nameText;
                case PATRONYMIC -> entry.patronymic = nameText;
            }

            return true;
        }
        throw new AppException(exceptionText);

    }

    public boolean setNme(String name) throws AppException {
        return fillEntryFromFullName(name, ExceptionText.name, EntryFromFullName.NAME);
    }

    public boolean setPatronymic(String patronymic) throws AppException {
        return fillEntryFromFullName(patronymic, ExceptionText.surname, EntryFromFullName.PATRONYMIC);
    }

    public boolean setLastName(String lastName) throws AppException {
        return fillEntryFromFullName(lastName, ExceptionText.lastName, EntryFromFullName.LASTNAME);
    }
}
