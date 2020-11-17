public class DocumentManager {
    public static DocumentManager instance;
    private static Book book;


    public DocumentManager() {
    }

    public static Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static DocumentManager getInstance() {
        if(instance == null){
            instance = new DocumentManager();
        }
        return instance;
    }


}
