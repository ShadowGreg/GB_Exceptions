import java.util.Arrays;

/*
* <aside>
📔 **Текст задачи:**

Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
* и возвращающий новый массив, каждый элемент которого равен сумме элементов двух
*  входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
* оповестить пользователя.

</aside>
* */
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = sumArrays(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов не совпадают");
        }

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        return result;
    }
}