package tack_nine;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    void setPrice(double newPrice){
        this.price = newPrice;
    }
    void printInfo(){
        System.out.println("Name: " + this.name + " Price: " + this.price);
    }
    public void applyDiscount(double discount){
    this.price = this.price - (this.price * discount / 100);
    }
}
