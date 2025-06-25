package task_seven;

public class Main {
    public static void main(String[] args) {
    Circle first = new Circle(5.0);
    System.out.println("Area:" + first.calculateArea() + " Circumference " + first.calculateCircumference());

    first.setRadius(7);
    System.out.println("Area:" + first.calculateArea() + " Circumference " + first.calculateCircumference());
    }
}
