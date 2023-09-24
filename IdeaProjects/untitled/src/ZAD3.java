import java.util.Scanner;

public class ZAD3 {
    public static  void main(String... args){
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Введите a: ");
        double a = Scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = Scanner.nextDouble();
        System.out.print(" Сумма "+ "=" +(a+b));
        System.out.print(" Произведение "+ "=" +a*b);
        System.out.print(" Разность "+ "=" +(a-b));
    }
}
