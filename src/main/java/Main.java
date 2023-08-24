import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество гостей.");
        while (true) {
            try {
                double persons = new Scanner(System.in).nextDouble();
                if (persons <= 1) {
                    throw new RuntimeException();
                }
                for (int i = 1; i <= persons; i++) {
                    Calculator.addProduct();
                    Calculator.showAllProducts();
                }
                ShowFinalSum(persons);
                break;
            } catch (RuntimeException e) {
                System.out.println("Введите корректное значение гостей числом больше 1");
            }
        }
    }

    private static void ShowFinalSum(double persons) {
        double sum = Calculator.returnSum() / persons;
        System.out.printf("Сумма на человека составляет " + "%.2f", sum);
        System.out.print(Calculator.declineRuble(sum));
    }
}
