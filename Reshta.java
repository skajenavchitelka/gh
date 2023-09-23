import java.util.Scanner;

public class Reshta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = scanner.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna = scanner.nextInt();

        int amount = convert(currency, hryvna);
        double change = getChange(currency, hryvna);
        print(amount, change);
    }

    static int convert(double currency, int hryvna) {
        return ((int) (hryvna / currency));
    }

    static double getChange(double currency, int hryvna) {
        return hryvna - convert(currency, hryvna) * currency;
    }

    static void print(int amount, double change) {
        System.out.println("You can byu " + amount);
        if (change != 0) {
            System.out.printf("You rest of money is %.2f", change);
            System.out.println();

        }

    }

}
