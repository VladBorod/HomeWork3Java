//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//Импорт функций.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//Cоздание класса.
public class Ex3FirstLastMiddle {
//    Создание main.
    public static void main(String[] args) {
//       Ввод длинны массива.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите длинну массива: ");
        int listLength = sc.nextInt();
//       Ввод данных массива.
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> mainArray = new ArrayList<Integer>();
        System.out.println("Введите данные в формате чисел: ");
        for (int i = 0; i < listLength; i++) {
            mainArray.add(Integer.valueOf(reader.nextLine()));
        }
        sc.close();
        reader.close();
//       Вывод данных через объявление нового массива и объявление методов.
        Integer[] arr = mainArray.toArray(new Integer[0]);
        System.out.println("Введенный Вами массив - " + Arrays.toString(arr) + ".");
        System.out.println("Наименьшее число - " + Arrays.toString(leastNumber(mainArray)) + ".");
        System.out.println("Наибольшее число - " + Arrays.toString(greaterNumber(mainArray)) + ".");
        System.out.println("Среднее арифметическое чисел - " + Arrays.toString(averageNumber(mainArray)) + ".");
    }
//    Метод поиска наименьшего числа.
    public static int[] leastNumber(ArrayList<Integer> arr){
        int first;
        Collections.sort(arr);
        first = arr.get(0);
        return new int[]{first};
    }
//    Метод поиска наибольшего числа.
    public static int[] greaterNumber(ArrayList<Integer> arr){
        int greater;
        Collections.reverse(arr);
        greater = arr.get(0);
        return new int[]{greater};
    }
//    Метод рассчета среднего арифметического чисел в массиве с учетом отрицательных значений.
    public static float[] averageNumber(ArrayList<Integer> arr){
        float summ = 0;
        float count = 0;
        for (Integer i:arr) {
            summ += i;
            count ++;
        }
        float average = summ/count;
        return new float[]{average};
    }
}
