package Exceptions;

import java.util.zip.DataFormatException;

public class AppException extends Exception {
    private static String localMsg ="\n ошибка не здана \n ";
    public AppException(){super(localMsg);}

    public AppException(String text){
        localMsg=text;
        new AppException(localMsg);
    }
}
