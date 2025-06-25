package task_two;

public class Main {
    public static void main(String[] args) {
    Rectangle p = new Rectangle(5, 10);
    int area = p.calculateArea();
    System.out.println("Area: " + area);

    p.setWidth(10);
    area = p.calculateArea();
    System.out.println("Area: " + area);

    }
}
