import java.util.Scanner;

public class KursovaTek {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n" +
                    "1.xL\n" +
                    "2.xC\n" +
                    "3.Переведення в експоненціальну\n" +
                    "4.Переведення в алгебраїчну\n" +
                    "5.Дії\n" +
                    "6.Відповідь\n");

            int r = Integer.parseInt(scanner.nextLine());

            if (r == 1) {
                System.out.print("L= ");
                double L = scanner.nextDouble();
                double XL = 314.16 * L * 0.001;
                System.out.println("XL= " + XL);
                System.out.println("В алгебраїчній формі: j" + XL);
                System.out.println("В експоненціальній формі: " + XL + "e^j90");
                scanner.nextLine();
            } else if (r == 2) {
                System.out.print("C= ");
                double C = scanner.nextDouble();
                double XC = 1000000 / (314.16 * C);
                System.out.println("XC= " + XC);
                System.out.println("В алгебраїчній формі: -j" + XC);
                System.out.println("В експоненціальній формі: " + XC + "e^-j90");
                scanner.nextLine();
            } else if (r == 3) {
                System.out.print("");
                double a = scanner.nextDouble();
                System.out.print("j");
                double j = scanner.nextDouble();
                double b = Math.sqrt(Math.pow(a, 2) + Math.pow(j, 2));
                double stepin = Math.toDegrees(Math.atan(j / a));
                System.out.println(b + " e^j" + stepin);
                scanner.nextLine();
            } else if (r == 4) {
                System.out.print("");
                double b = scanner.nextDouble();
                System.out.print("e^j");
                double stepin = scanner.nextDouble();
                double a = b * Math.cos(Math.toRadians(stepin));
                double j = b * Math.sin(Math.toRadians(stepin));
                System.out.println(a + " j" + j);
                scanner.nextLine();
            } else if (r == 5) {
                System.out.println("1.Додавання і Віднімання\n" +
                        "2.Множення\n" +
                        "3.Ділення\n");

                int s = Integer.parseInt(scanner.nextLine());

                if (s == 1) {
                    System.out.print("");
                    double a1 = scanner.nextDouble();
                    System.out.print("j");
                    double j1 = scanner.nextDouble();
                    System.out.print("");
                    double a2 = scanner.nextDouble();
                    System.out.print("j");
                    double j2 = scanner.nextDouble();
                    double a = a1 + a2;
                    double j = j1 + j2;
                    System.out.println(a + " j" + j);
                    scanner.nextLine();
                } else if (s == 2) {
                    System.out.print("");
                    double b1 = scanner.nextDouble();
                    System.out.print("e^j");
                    double stepin1 = scanner.nextDouble();
                    System.out.print("");
                    double b2 = scanner.nextDouble();
                    System.out.print("e^j");
                    double stepin2 = scanner.nextDouble();
                    double b = b1 * b2;
                    double stepin = stepin1 + stepin2;
                    System.out.println(b + "e^j" + stepin);
                    scanner.nextLine();
                } else if (s == 3) {
                    System.out.print("");
                    double b1 = scanner.nextDouble();
                    System.out.print("e^j");
                    double stepin1 = scanner.nextDouble();
                    System.out.print("");
                    double b2 = scanner.nextDouble();
                    System.out.print("e^j");
                    double stepin2 = scanner.nextDouble();
                    double b = b1 / b2;
                    double stepin = stepin1 - stepin2;
                    System.out.println(b + "e^j" + stepin);
                    scanner.nextLine();
                }
                scanner.nextLine();
            } else if (r == 6) {
                System.out.print("");
                double v = scanner.nextDouble();
                double Vm = v * Math.sqrt(2);
                System.out.print("fi");
                double f = scanner.nextDouble();
                System.out.println("I,U= " + Vm + "Sin(314.16t " + f + ")");
                scanner.nextLine();
            }
        }
    }

}

