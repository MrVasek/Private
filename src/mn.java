import java.util.Scanner;

/**
 * Created by admin on 04.12.2016.
 */
public class mn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("");
            double b1 = scanner.nextDouble();
            System.out.print("e^j");
            double stepin1 = scanner.nextDouble();
            System.out.print("");
            double b2 = scanner.nextDouble();
            System.out.print("e^j");
            double stepin2 = scanner.nextDouble();
            System.out.print("");
            double b3 = scanner.nextDouble();
            System.out.print("e^j");
            double stepin3 = scanner.nextDouble();
            double b = b1 * b2 * b3;
            double stepin = stepin1 + stepin2 + stepin3;
            System.out.println(b + "e^j" + stepin);
            scanner.nextLine();
        }
    }
}
