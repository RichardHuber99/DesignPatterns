import java.util.ArrayList;

<<<<<<< HEAD
public class Section implements IElement{

    public String sectionTitle;
    public ArrayList<IElement> content = new ArrayList<>();


    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public void add(IElement e){
        content.add(e);
    }

    public void remove(IElement e){
        content.remove(e);
    }

    public IElement getElement(int i){
        return content.get(i);
    }

    @Override
    public void print() {
        System.out.println("Section:" + this.sectionTitle);
        for(IElement c :content){
            c.print();
        }
    }
}
=======
public class Section implements Element{

    protected String sectionTitle;
    protected ArrayList<Element> content = new ArrayList<>();

    Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public int add(Element elm){
        content.add(elm);
        return content.size();
    }

    public void remove(Element elm){
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print(){
        System.out.println("Section: "+this.sectionTitle);
        for(Element i : content){
            i.print();
        }
    }

}
>>>>>>> feefa8e... Lab5
