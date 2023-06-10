import java.io.FileNotFoundException;
import java.io.FileReader;

/*
* Создайте класс исключения, который будет выбрасываться при делении на 0.
*  Исключение должно отображать понятное для пользователя сообщение об ошибке.
*
Создайте класс исключений, которое будет возникать при обращении к пустому элементу
* в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об
* ошибке
*
Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
* Исключение должно отображать понятное для пользователя сообщение об ошибке.
* */
public class Main {
    public static void main(String[] args) throws ThirdExceptions {
//        int first = 0;
//        try {
//            first = 1312;
//            int num = first / 0;
//        } catch (ArithmeticException e) {
//            throw new FirstException(first);
//        }
//        int index = 3;
//        try {
//            Integer[] num = new Integer[]{
//                1,2,3,null
//            };
//            int temp = num[index];
//        } catch (NullPointerException e) {
//            throw new SecondExceptions(index);
//        }
        try {
            FileReader fr = new FileReader("пустой.йо");
        } catch (FileNotFoundException e) {
            throw new ThirdExceptions();
        }

    }
}