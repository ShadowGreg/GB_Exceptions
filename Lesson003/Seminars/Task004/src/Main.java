/*
* Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
* При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
*
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
* Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
* или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
* в какой именно ячейке лежат неверные данные.
*
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
* и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на
* вход корректный массив).


* */
public class Main {
    public static void main(String[] args) {
        String[][] newArray = new String[][]{
                {"sdf","dfsgf"},
                {"sdf","d"}
        };
        try {
          //  CheckSise(newArray);
          int temp = Integer.parseInt(newArray[0][0]);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            throw new MyArrayDataException(0,0);
        }

    }


    public static void CheckSise(String[][] num) throws MyArraySizeException {
        if (num.length != 4 && num[0].length != 4)
            throw new MyArraySizeException();
    }
}