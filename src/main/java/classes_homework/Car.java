package classes_homework;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }
    void print(){
        System.out.println("Brand: " + this.brand + " Year: " + this.year);
    }

    int getYear(){
        return this.year;
    }

    String getBrand(){
        return this.brand;
    }
    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
}
