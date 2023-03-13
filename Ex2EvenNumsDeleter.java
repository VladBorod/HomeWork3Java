//Пусть дан произвольный список целых чисел, удалить из него чётные числа
//Импорт функций.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Создание класса.
public class Ex2EvenNumsDeleter {
//    Создание main.
    public static void main(String[] args) {
//       Ввод длинны массива.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите длинну массива: ");
        int listLength = sc.nextInt();
//       Ввод данных массива.
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> arrayWithEvenNums = new ArrayList<Integer>();
        System.out.println("Введите данные в формате чисел: ");
        for (int i = 0; i < listLength; i++) {
            arrayWithEvenNums.add(Integer.valueOf(reader.nextLine()));
        }
        sc.close();
        reader.close();

//        Вывод данных с экономией памяти.
//        for (Integer j:arrayWithEvenNums) {
//            System.out.printf(String.valueOf("|" + j));
//        }

//        Вывод данных через конвертацию в новый массив.
        Integer[] arr = arrayWithEvenNums.toArray(new Integer[0]);
        System.out.println("Введенный Вами массив - " + Arrays.toString(arr));
//        Объявлениме и вывод функции.
        System.out.println("Массив без четных чисел - " + evenRemover(arrayWithEvenNums));
    }
//
    public static ArrayList<Integer> evenRemover(ArrayList<Integer> arr){
//      Создание нового массива.
        ArrayList<Integer> newArr = new ArrayList<Integer>();
//      Основная логика.
        for (Integer i:arr) {
            if (i % 2 != 0){
                newArr.add(i);
            }
        }
        return newArr;
    }
}
