/*
<aside>
📔 **Текст задачи:**

        Реализуйте метод, принимающий в качестве аргументов двумерный массив.
        Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
        детализировать какие строки со столбцами не требуется. Как бы вы реализовали подобный метод.
</aside>*/

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 1}, {0, 1, 0}, {1, 0}};
        checkSquare(array);
    }

    public static void checkSquare(int[][] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i].length != n) {
                System.out.println("Строка " + i + " имеет длину " + array[i].length + ", ожидалось " + n);
            }
        }
    }
}