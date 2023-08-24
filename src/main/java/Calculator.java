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
            if (productName.equalsIgnoreCase("Завершить")) {
                break;
            }
            System.out.println("Введите цену товара.");
            while (true) {
                try {
                    double productPrice = new Scanner(System.in).nextDouble();
                    if (productPrice <= 0) {
                        throw new RuntimeException();
                    }
                    Product product = new Product(productName, productPrice);
                    sum += product.price;
                    allProducts.add(product.name);
                    break;
                } catch (RuntimeException e) {
                    System.out.println("Введите корректное значение цены числом больше 0");
                }
            }
        }
    }

    public static void showAllProducts() {
        if (allProducts.isEmpty()) {
            System.out.println("Нет добавленных продуктов");
        }
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
            return " рублей";
        } else if (lastDigit == 1) {
            return " рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return " рубля";
        } else {
            return " рублей";
        }
    }
}
