import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 312;
        int b = 90;
        long qq = 878278428374728L;
        short bb = 32767;
        byte num = 127; // -128 до 127
        String word = "Almaty";
        String phrase = "Wow, it's amazing, right now i learning my first program language";
        System.out.println(num);
        // Конкатенация
        System.out.println("right now variable a = " + a++);
        System.out.println("after increase variable a = " + a);
        System.out.println("type long + type short = " + qq + bb); // my first comment
        System.out.println(phrase);
        System.out.println("a + b = " + a+b);
        System.out.println(word + a);
        // Ввод с клавиатуры
        System.out.print("Enter your number please: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your text please: ");
        String text = scanner.nextLine();
        System.out.println("Your number is = " + x + " " + "Your text is = " + text);
        // Преобразование строки в число
        String str = "5421";
        int xxx = Integer.parseInt(str);
        System.out.println(xxx);
        // Работа со строками
        String str1 = "My NAME IS Tima, i live in THAT city...";
        int xx = str1.length();
        System.out.println("length variable str1: " + xx);
        System.out.println(str1.toLowerCase()); // нижний регистр
        System.out.println(str1.toUpperCase()); // верхний регистр
    }
}