package task_three;

public class Books {
    String title;
    String author;

    Books(String someTitle, String someAuthor){
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
