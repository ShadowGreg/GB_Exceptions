public class MyArrayDataException extends RuntimeException {
    private static String msg = " неверные данные";

    public MyArrayDataException(int rowIndex, int colIndex) {
        super("строка: "+rowIndex + " колонка: " + colIndex +  msg);
    }
}
