import java.util.Arrays;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Массивы
//        int [] arr = new int[5];
//        System.out.println("Массив заполненный нулями: " + Arrays.toString(arr));
//        arr[0] = 4;
//        arr[1] = 7;
//        arr[2] = 10;
//        arr[3] = 1;
//        arr[4] = 5;
//        System.out.println("Заполненный массив: " + Arrays.toString(arr));
//
//        System.out.println("____________________________");
//// Копирование массива
//        int [] original = new int[]{1,5,10,12,98,34};
//        System.out.println("Оригинальный массив для копирования: " + Arrays.toString(original));
//        int [] copy = new int[original.length];
//        int [] copyOf = Arrays.copyOf(original, original.length); // спец метод copyOf, для копирования элементов массива без циклов
//        System.out.println("Скопированный массив через метод copyOf: "+ Arrays.toString(copyOf));
//        for (int i = 0; i < original.length; i++) {
//            copy[i] = original[i];
//            System.out.println(Arrays.toString(copy)); // вывода процесса копирования массива
//        }

        // Добавление элементов в массив используя цикл for
//        int [] tims = new int[10];
//        for (int i = 0; i < tims.length; i++) {
//            tims[i] = i + 1;
//            System.out.println(Arrays.toString(tims)); // вывод процесса добавления элементов в массив
//        }
//        System.out.println("Готовый массив:" + Arrays.toString(tims));
//
//        // Удаление элемента из массива
//        int [] deleted = new int[tims.length - 1];
//        int delIndexElement = 5; // индекс удаляемого элемента
//        for (int i = 0, j = 0; i < tims.length; i++) { // j используем для индексации нового массива
//            if (i != delIndexElement) deleted[j++] = tims[i]; // если 5==5 он у нас не копируется и индекс j не увеличивается
//        }
//        System.out.println(Arrays.toString(deleted));


        // Сравнение вещественных чисел
//        double f = 0.1d;
//        double d = 0.2d;
//
//        System.out.println(f+d);
//
//        BigDecimal f1 = new BigDecimal("0.1");
//        BigDecimal d1 = new BigDecimal("0.2");
//
//        BigDecimal result = f1.add(d1);
//        System.out.println(result);
//
//        double f2 = 0.1;
//        for (int i = 0; i <= 11 ; i++) {
//            f2 += 0.1;
//        }
//        double f3 = 0.1 * 11;
//        System.out.println("f2 " + f2);
//        System.out.println("f3 " + f3);
//
//        if (Math.abs(f2-f3) < 0.1) {
//            System.out.println("равны");
//        } else {
//            System.out.println("нифига не равны");
//        }

        // Циклы
//        for (int i = 1; i <= 25 ; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        int ii = 1;
//        while (ii <= 20) {
//            ii++;
//            if (ii % 7 == 0 ) {
//                continue;
//            }
//            System.out.println(ii);
//
//        }
        // рисуем треугольник
//        for (int i = 0; i < 10; i++) {
//            int StarCount = 10 - i;
//            for (int j = 0; j < StarCount; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(); // переход на след строку
//
//        }

        // второе по величине минимальное число из введеных чисел
//        Scanner sc = new Scanner(System.in);
//        int min1 = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//        System.out.print("Введите число: ");
//
//        while (sc.hasNextInt()) {
//            int i = sc.nextInt(); // пользователь вводит число
//            System.out.print("Введите число или любую строку для прерывания цикла: ");
//            if (i < min1) {
//                min2 = min1; // копируется значение min1 в переменную min2, старое минимал становится вторым минимал
//                min1 = i; // присваиваем переменной min1 , текущее минимальное число
//            } else if ((min1 < i) && (i < min2)) { // если текущ число больш минимал но меньше второго минимал
//                min2 = i; // текущ число становится вторым минимальным
//            }
//        }
//        System.out.println("Второе по величине минимальное число: " + min2);


    }
}
