//Текст задачи:
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив. Если длина массива меньше
//        некоторого
//        заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[]{1,2,5,6,7};

        System.out.println(ReturnLength(newArray, 1));
        System.out.println("-----");
        System.out.println(ReturnLength(newArray, 2));
        System.out.println("-----");
        System.out.println(ReturnLength(newArray, 10));
        System.out.println("-----");
        System.out.println(ReturnLength(newArray, -1));
        System.out.println("-----");
        System.out.println(ReturnLength(newArray, null));
    }

    public static int ReturnLength(int[] inArray, Integer inNum){
        if (inNum == null){
            return -2;
        }
        if(inArray.length<inNum){
            return -1;
        }
        return inArray.length;
    }
}