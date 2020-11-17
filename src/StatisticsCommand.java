public class StatisticsCommand implements Command {


    @Override
    public void execute() {

        Book book1 = DocumentManager.getInstance().getBook();
        BookStatistics stats = new BookStatistics();
        book1.accept(stats);
        stats.printStatistics();

    }
}
