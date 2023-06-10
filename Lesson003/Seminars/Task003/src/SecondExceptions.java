/*
Создайте класс исключений, которое будет возникать при обращении к пустому элементу
в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об
ошибке
  */
public class SecondExceptions extends RuntimeException{
    private static String msg = "Вот горшок пустой - он предмет простой";
    public SecondExceptions(){
        super(msg);
    }
    public SecondExceptions(int index){
        super(index+" "+msg);
    }
}
