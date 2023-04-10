/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayElementsSum {


    public static void main(String[] args) {

        int[] firstArray = getRandomArray(5);
        int[] secondArray = getRandomArray(5);

        try {


            System.out.println();
            System.out.println("Прогон двух массивов одной длины:");
            System.out.println("Первый массив: " + Arrays.toString(firstArray));
            System.out.println("Второй массив: " + Arrays.toString(secondArray));
            System.out.println("Результирующий массив: " + Arrays.toString(ArrayElementsSum.ArraySum(firstArray, secondArray)));
            System.out.println();

            firstArray = getRandomArray(4);
            secondArray = getRandomArray(6);

            System.out.println("А сейчас накосяпорим. Прогон двух массивов разной длины:");
            System.out.println("Первый массив: " + Arrays.toString(firstArray));
            System.out.println("Второй массив: " + Arrays.toString(secondArray));
            System.out.println("Результирующий массив: " + Arrays.toString(ArrayElementsSum.ArraySum(firstArray, secondArray)));

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }

    public static int[] ArraySum(int[] firstArray, int[] secondArray) {

        int[] result = new int[firstArray.length];

        try {

            if (firstArray.length != secondArray.length) {
                throw new RuntimeException ("Arrays have different length");
            }

            for (int i = 0; i < firstArray.length; i++) {
                result[i] = firstArray[i] + secondArray[i];
            }

        } catch (Exception e) {
            throw new RuntimeException("Method \"ArraySum\" throw \"" + e.getClass().getName() + "\" cause \"" + e.getMessage() + "\"");
        }

        return result;
    }

    public static int[] getRandomArray(int size) {

        Random r = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {

            array[i] = r.nextInt(10);
        }

        return array;
    }


}
