import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 312;
        int b = 90;
        long qq = 878278428374728L;
        short bb = 32767;
        byte alpha = 127;
        System.out.println("right now variable a = " + a++);
        System.out.println("after increase variable a = " + a);
        System.out.println("type long + type short = " + qq + bb); // my first comment
        String word = "Almaty";
        String phrase = "Wow, it's amazing, right now i learning my first program language";
        System.out.println(phrase);
        System.out.println("a + b = " + a+b);
        System.out.println(word + a);

        System.out.print("Enter your number please: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your text please: ");
        String text = scanner.nextLine();
        System.out.println("Your number is = " + x + " " + "Your text is = " + text);

    }
}