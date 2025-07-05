package java_fundamentals;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value (press Enter to skip): ");
        String n = sc.nextLine();

        System.out.print("Enter second value (press Enter to skip): ");
        String m = sc.nextLine();

        if (n.isEmpty() && m.isEmpty()) {
            System.out.println("No values");
        } else if (!n.isEmpty() && !m.isEmpty()) {
            System.out.println(n + "," + m);
        } 
    }
}
