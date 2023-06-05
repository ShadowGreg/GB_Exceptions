/*
Текст задачи:
        Реализуйте метод, принимающий в качестве аргумента целочисленный
        двумерный массив. Необходимо посчитать и вернуть сумму элементов этого массива.
        При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
        массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только
        значение 0 или 1. Если нарушается одно из условий, метод должен вернуть код ошибки.
        Программа должна корректно обработать код ошибки и вывести соответствующее сообщение
        пользователю. Сравнить такой вариант обработки исключений с предыдущим. Какое преимущество
        у исключений перед кодами ошибок вы можете назвать в данном случае?

 */
public class Main {
    public static void main(String[] args) {
        Integer [][] newArrayOne = {{0,1,0,1}, {0,1,0,1}, {1,0,0,1}, {1,0,0,1}};
        Integer [][] newArrayTwo = {{0,1,0,1}, {0,1,0,1}, {1,0,0,1}};
        Integer [][] newArrayThree = {{0,1,2,1}, {6,1,0,1}, {3,0,0,1}, {1,7,0,1}};

        System.out.println("-----");
        ErrorExecutor(chekArray(newArrayOne));
        System.out.println("-----");
        ErrorExecutor(chekArray(newArrayTwo));
        System.out.println("-----");
        ErrorExecutor(chekArray(newArrayThree));
        System.out.println("-----");
    }

    public static void ErrorExecutor(int inError){
        switch (inError){
            case (-1):
                System.out.println("Массив не квадратный");
                break;
            case (-2):
                System.out.println("Массив содержит недопустимые значения");
                break;
            default:
                System.out.println(inError);
        }
    }
    public static int chekArray(Integer[][] array) {
        int summ = 0;

        StringBuilder message = new StringBuilder();

        if (array.length != array[0].length) {
            return -1;
//            throw new RuntimeException(String.format("Массив не квадратный длинна: %d , высота: %d",  array[0].length ,array.length));
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
            return -2;
//            throw new RuntimeException(String.format("Массив содержит недопустимые значения: %s", message));
        }

        return summ;
    }
}