import java.io.IOException;

public class MyArraySizeException extends RuntimeException {
    private static String msg = "размер не верный";

    public MyArraySizeException() {
        super(msg);
    }
}
