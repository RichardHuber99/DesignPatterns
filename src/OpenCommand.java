public class OpenCommand implements Command {


    @Override
    public void execute() {
        Book book1 = new Book("Book 1")       ;
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new Paragraph("Paragraph 5"));
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Table("Table 1"));
        book1.addContent(cap1);
        
        DocumentManager.getInstance().setBook(book1);



     




    }
}
