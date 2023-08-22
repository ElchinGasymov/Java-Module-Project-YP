public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Товар успешно добавлен");
        System.out.println("Добавим еще один товар?");
    }
}
