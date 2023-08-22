import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество человек.");
        double persons = scanner.nextDouble();
        while (true) {
            if (persons <= 1) {
                System.out.println("Количество человек должно быть больше одного.");
                System.out.println("Введите количество человек.");
                persons = scanner.nextInt();
            } else {
                for (int i = 1; i <= persons; i++) {
                    Calculator.addProduct();
                    Calculator.showAllProducts();
                }
                ShowFinalSum(persons);
                break;
            }
        }
    }

    private static void ShowFinalSum(double persons) {
        double sum = Calculator.returnSum() / persons;
        System.out.printf("Сумма на человека составляет " + "%.2f%n", sum);
        System.out.println(Calculator.declineRuble(sum));
    }
}
