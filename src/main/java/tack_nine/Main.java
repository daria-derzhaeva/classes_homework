package tack_nine;

public class Main {
    public static void main(String[] args) {
    Product book = new Product("Popular", 2000);
    book.setPrice(1500);
    book.applyDiscount(10);
    System.out.println("Name: " + book.getName() + " Current price: " + book.getPrice());
    }
}
