package Exceptions;

public class ExceptionText {
    private static final String constForName = "тест должен состоять из букв, попробуйте ещё раз\n";
    private static final String startFillFullName = "\n не верно задано ";

    public static String name = startFillFullName+"имя\n " + constForName;
    public static String surname = startFillFullName+"отчество\n" + constForName;
    public static String lastName = startFillFullName+"фамилия\n" + constForName;
}
