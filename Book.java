<<<<<<< HEAD

import java.util.ArrayList;

public class Book {
    private String title;

    private ArrayList<IElement> content = new ArrayList<>();
=======
import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Element> content = new ArrayList<>();
>>>>>>> feefa8e... Lab5
    private ArrayList<Author> authors = new ArrayList<>();

    Book(String title){
        this.title=title;
    }

<<<<<<< HEAD
    public void addContent(IElement e){
        content.add(e);
=======
    public void addContent(Element elm){
        content.add(elm);
>>>>>>> feefa8e... Lab5
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void print(){
<<<<<<< HEAD
        System.out.println("Book name: " + this.title);
        printAuthors();
        printContent();

=======
        System.out.println("Book title: "+this.title);
        printAuthors();
        for(Element i:content){
            i.print();
        }
>>>>>>> feefa8e... Lab5
    }


    private void printAuthors(){
<<<<<<< HEAD
        for(Author i: authors)
        {
=======
        for (Author i: authors){
>>>>>>> feefa8e... Lab5
            i.print();
        }
    }

<<<<<<< HEAD
    private void printContent(){
        for (IElement c : content){
            c.print();
        }
    }


=======
>>>>>>> feefa8e... Lab5
}