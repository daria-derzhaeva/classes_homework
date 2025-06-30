package task_two;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }
    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }
    void setWidth(int newWidth){
        this.width = newWidth;
    }
    public int calculateArea(){
        return width * height;
    }
}
