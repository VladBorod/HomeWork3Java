//Реализовать алгоритм сортировки слиянием.
//Импорт функций.
import java.util.Arrays;
import java.util.Scanner;
//Создание класса.
public class Ex1QuickSort {
//Создание main.
    public static void main(String[] args) {
//        Ввод длинны массива.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите длинну массива: ");
        int arrLength = sc.nextInt();
//        Ввод данных в массив.
        Scanner in = new Scanner(System.in);
        int[] arrayForQuickSort = new int[arrLength];
        System.out.println("Введите данные в формате чисел: ");
        for (int i = 0; i < arrLength; i++) {
            arrayForQuickSort[i] = Integer.parseInt((in.nextLine()));
        }
//        Экономим память!
        sc.close();
        in.close();
//        Вывод первоначального массива
        System.out.println("Введенныйе Вами данные: " + Arrays.toString(arrayForQuickSort));
//        Объявление функции и вывод отсортированного массива.
        quickSort(arrayForQuickSort);
        System.out.println("Ваши данные отсортированы: " + Arrays.toString(arrayForQuickSort));
    }
//  Функция "Разделяй и властвуй".
    private static void quickSort(int[] arr){
//      Создание переменной-ориентира по длинне.
        int len = arr.length;
        if (len == 1) return;
        int middle = len / 2;
//        Создание новых массивов.
        int[] leftPart = new int[middle];
        int[] rightPart = new int[len - middle];
//          Логика первичного разделения массивов на две части.
        for (int i = 0; i < middle; i++) {
            leftPart[i] = arr[i];
        }
        for (int i = 0; i < len - middle; i++) {
            rightPart[i] = arr[i + middle];
        }
//          Рекурсия и дальнейшее разделение массивов.
        quickSort(leftPart);
        quickSort(rightPart);
        combineParts(arr, leftPart, rightPart);
    }
//  Функция объеденения.
    private static void combineParts(int[] arr, int[] leftPart, int[] rightPart){
//          Создание переменных-ориентиров.
        int left = leftPart.length;
        int right = rightPart.length;
        int i = 0;
        int j = 0;
        int index = 0;
//          Основная логика объеденения.
        while (i < left && j < right){
            if (leftPart[i] < rightPart[j]){
                arr[index] = leftPart[i];
                i++;
                index++;
            }else{
                arr[index] = rightPart[j];
                j++;
                index++;
            }
        }
//          Довведение недостающих элементов.
        for (int k = i; k < left; k++) {
            arr[index++] = leftPart[k];
        }
        for (int t = j; t < right; t++) {
            arr[index++] = rightPart[t];
        }
    }
}
