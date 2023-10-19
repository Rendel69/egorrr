package lab6;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
// Задаем систему номиналов доступных купюр
        int[] denominations = {5000,2000, 1000,500, 200, 100, 50, 10};

// Вводим сумму для выдачи
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для выдачи: ");
        int amount = scanner.nextInt();

// Выполняем выдачу
        System.out.println("Выдача купюр:");
        for (int i = 0; i < denominations.length; i++) {
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + " рублевых: " + count + " шт");
                amount %= denominations[i];
            }
        }

        if (amount > 0) {
            System.out.println("Сумму невозможно выдать полностью");
        }
    }
}
