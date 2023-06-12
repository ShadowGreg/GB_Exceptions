package Exceptions;

public class ExceptionText {
    private static final String constForName = "тест должен состоять из букв, ";
    private static final String tryAgain = "попробуйте ещё раз\n";
    private static final String startFillFullName = "\n не верно задано ";

    public static String name = startFillFullName + "имя\n " + constForName + tryAgain;
    public static String surname = startFillFullName + "отчество\n" + constForName + tryAgain;
    public static String lastName = startFillFullName + "фамилия\n" + constForName + tryAgain;
    public static String wordsCountName = startFillFullName + "количество слов в полном имени\n" + tryAgain;
}
