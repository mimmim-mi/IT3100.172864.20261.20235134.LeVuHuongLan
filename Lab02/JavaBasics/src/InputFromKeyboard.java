import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        keyboard.close();
    }
}