import java.util.Arrays;

//* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя. Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        try {
            int[] result = calculateQuotient(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}