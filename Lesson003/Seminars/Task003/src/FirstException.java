/*
 * Создайте класс исключения, который будет выбрасываться при делении на 0.
 *  Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class FirstException extends RuntimeException {
    private static String msg = "ты делишь на нуль";
    public FirstException(){
        super(msg);
    }
    public FirstException(int firstNumber){
        super(firstNumber+" "+msg);
    }
}
