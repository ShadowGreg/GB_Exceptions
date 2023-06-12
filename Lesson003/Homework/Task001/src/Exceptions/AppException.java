package Exceptions;

import java.util.zip.DataFormatException;

public class AppException extends Exception {
    private static String localMsg ="\n ошибка не здана \n ";

    public AppException(String msg){
        super(msg);
    }
    public AppException(){
        new AppException(localMsg);
    }
}
