import java . util. Scanner;
public class Dialog {
     public static void main (String[] args) { 

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello");
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("How old are you?");
        age = scanner.nextInt();

System. out. println("Дуже приємно,"+name);
System. out. println("Як я зрозуміла, тобі "+age+"років");

}
}