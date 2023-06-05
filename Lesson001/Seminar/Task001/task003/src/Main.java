/*Текст задачи:
        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем
        на метод 2 ограничения: метод может работать только с квадратными массивами
        (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/

/*
Текст задачи:
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

public class Main {
    public static void main(String[] args) {
        Integer [][] newArrayOne = {{0,1,0,1}, {0,1,0,1}, {1,0,0,1}, {1,0,0,1}};
        Integer [][] newArrayTwo = {{0,1,0,1}, {0,1,0,1}, {1,0,0,1}};
        Integer [][] newArrayThree = {{0,1,2,1}, {6,1,0,1}, {3,0,0,1}, {1,7,0,1}};

        System.out.println("-----");
        System.out.println(chekArray(newArrayOne));
        //System.out.println("-----");
        //System.out.println(chekArray(newArrayTwo));
        System.out.println("-----");
        System.out.println(chekArray(newArrayThree));
        System.out.println("-----");
    }

    public static int chekArray(Integer[][] array) {
        int summ = 0;

        StringBuilder message = new StringBuilder();

        if (array.length != array[0].length) {
            throw new RuntimeException(String.format("Массив не квадратный длинна: %d , высота: %d",  array[0].length ,array.length));
        }

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length; j ++)
            {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    message.append(array[i][j]).append("->");
                    message.append(" [").append(i);
                    message.append(" ").append(j).append("]; ");
                }
                else {
                    summ += array[i][j];
                }
            }
        }

        if (message.length() != 0) {
            throw new RuntimeException(String.format("Массив содержит недопустимые значения: %s", message));
        }

        return summ;
    }
}

