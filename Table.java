<<<<<<< HEAD
public class Table implements IElement{

    private String name;

    Table(String name) {
        this.name=name;
    }

    public void print() {
        System.out.println("Table with name: " + this.name);
    }
=======
public class Table implements Element{

    private String name;

    Table(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("Table with name: "+this.name);
    }

>>>>>>> feefa8e... Lab5
}