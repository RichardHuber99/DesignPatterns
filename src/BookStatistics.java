public class BookStatistics implements Visitor {

    private int imageCounter = 0;
    private int tablesCounter = 0;
    private int paragraphsCounter = 0;
    private int sectionCounter = 0;
    private int bookCounter = 0;

    public void visit(Image image){
        imageCounter++;
    }
    public void visit(ImageProxy imageProxy){
        imageCounter++;
    }
    public void visit(Paragraph paragraph){
        paragraphsCounter++;
    }
    public void visit(Table table){
        tablesCounter++;
    }
    public void visit(Section section){
        sectionCounter++;
    }
    public void visit(Book book){
        bookCounter++;
    }

    public void printStatistics(){
        System.out.println("Nr of books: " + bookCounter);
        System.out.println("Nr of sections: " + sectionCounter);
        System.out.println("Nr of paragraphs: " + paragraphsCounter );
        System.out.println("Nr of paragraphs: " + paragraphsCounter );
        System.out.println("Nr of tables: " + tablesCounter);

    }

}
