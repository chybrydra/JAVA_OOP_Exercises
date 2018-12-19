package state2;

public class BookUnavailable implements BookState{

    @Override
    public void reportState(Book book) {
        System.out.println("The book: \"" + book.getAuthor() + ": " + book.getTitle()  + "\" is not available!");
    }
}
