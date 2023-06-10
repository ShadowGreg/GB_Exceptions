import java.io.IOException;

/*
Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
* Исключение должно отображать понятное для пользователя сообщение об ошибке.
* */
public class ThirdExceptions extends IOException {

    //    public static void Create() throws ThirdExceptions{
//        throw new ThirdExceptions();
//    }
//    public ThirdExceptions(){
//        super("Нету тела - нету дела");
//    }
    private static String msg = "Нету тела - нету дела";

    public ThirdExceptions() {
        super(msg);
    }
}
