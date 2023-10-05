package lab4;

import java.util.Scanner;

public class zad1var2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите число от 0 до 9");
        int z = sc.nextInt();

        if (z==0){
            System.out.print("Ноль");

        }else if(z==1){
            System.out.println("Один");
        } else if(z==2){
            System.out.println("Два");
        } else if(z==3){
            System.out.println("Три");
        } else if(z==4){
            System.out.println("Четыре");
        } else if(z==5){
            System.out.println("Пять");
        } else if(z==6){
            System.out.println("Шесть");
        } else if(z==7){
            System.out.println("Семь");
        } else if(z==8){
            System.out.println("Восемь");
        } else if(z==9){
            System.out.println("Девять");
        }else{
            System.out.println("Ошибка ЫЫедите число от 1 до 9");
        }
    }
}
