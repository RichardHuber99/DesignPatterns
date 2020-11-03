<<<<<<< HEAD
public class Paragraph implements IElement {
    private String name;

    Paragraph(String name) {
        this.name=name;
    }

    public void print() {
        System.out.println("Paragraph with name: " + this.name);
    }
=======
public class Paragraph implements Element{

    private String name;

    Paragraph(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("Paragraph with name: "+this.name);
    }

>>>>>>> feefa8e... Lab5
}