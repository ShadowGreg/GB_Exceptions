//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Main {
    public static void main(String[] args) {
        ExceptionUtils exceptionUtils = new ExceptionUtils();
        try {
            exceptionUtils.throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptionUtils.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptionUtils.throwNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}