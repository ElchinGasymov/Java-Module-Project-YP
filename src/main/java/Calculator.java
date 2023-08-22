import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    static double sum;

    static ArrayList<String> allProducts = new ArrayList<>();

    public static void addProduct() {
        while (true) {
            System.out.println("Введите название товара.");
            String productName = scanner.next();
            if (productName.equalsIgnoreCase("Завершить.")) {
                System.out.println("Вы не ввели ни одного товара.");
            } else {
                System.out.println("Введите цену товара.");
                double ProductPrice = scanner.nextDouble();
                Product product = new Product(productName, ProductPrice);
                sum += product.price;
                allProducts.add(product.name);
                if (scanner.next().equalsIgnoreCase("Завершить")) {
                    break;
                }
            }
        }
    }

    public static void showAllProducts() {
        System.out.println("Добавленные товары:");
        for (int i = 0; i < allProducts.size(); i++) {
            System.out.println(allProducts.get(i));
        }
    }

    public static double returnSum() {
        return sum;
    }

    public static String declineRuble(double amount) {
        long rubles = (long) amount;
        long lastDigit = rubles % 10;
        long lastTwoDigits = rubles % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return rubles + " рублей";
        } else if (lastDigit == 1) {
            return rubles + " рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return rubles + " рубля";
        } else {
            return rubles + " рублей";
        }
    }
}
