import java.util.*;

public class billsplit {
    static void error() throws ArithmeticException {
        throw new ArithmeticException("Cannot split bill between 0 people!!");
    }

    public static void split(int n, int amt) {
        if (n == 0) {
            error();
        } else {
            System.out.println("The amount an individual has to pay: " + amt / n);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        int amt = sc.nextInt();
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        try {
            split(n, amt);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thank you for using the app");
        }
    }
}
