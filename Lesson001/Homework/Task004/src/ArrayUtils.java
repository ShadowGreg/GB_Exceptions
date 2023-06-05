public class ArrayUtils {
    public static Integer[] calculateQuotient(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        Integer[] result = new Integer[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            } else if (array1[i] == null || array2[i] == null) {
                throw new RuntimeException("Один из элементов массива не существует");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }

}
