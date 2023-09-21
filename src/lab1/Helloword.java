package lab1;

import java.util.Scanner;

public class Helloword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания");

        int numberZadanie = scanner.nextInt();

        switch (numberZadanie) {

            case 1:
                System.out.println(sum(1, 2));
                break;

            case 2:
                System.out.println(sum(3, 2));
                break;
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число 1:");
        double ch1 = scanner.nextDouble();
        System.out.println("Введите число 2:");
        double ch2 = scanner.nextDouble();

        System.out.println("Сумма = " + sum(ch1, ch2));
    }



    public static double sum(double ch1, double ch2) {
        return ch1 + ch2;
    }
    public static double sum2(int ch1, int ch2) {
        return ch1 + ch2;
    }
}
