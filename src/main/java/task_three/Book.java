package task_three;

public class Book {
    private String title;
    private String author;

    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void printInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}
