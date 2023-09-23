import java.util.Scanner;

public class Dialog {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String name;
                int age;
                System.out.println("Hello");
                System.out.println("What is your name?");
                name = sc.nextLine();
                System.out.println("How old are you?");
                age = sc.nextInt();
                System.out.println("Дуже приємно," + name);
                System.out.println("Як я зрозуміла, тобі " + age + "років");
        }
}