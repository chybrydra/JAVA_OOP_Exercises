package state2;

public class Main {

    public static void main(String[] args) {

        Book kniga1 = new Book.Builder("La billebaude")
                .bookAuthor("Bernard Clavel")
                .bookCategory(BookCategory.BIOGRAPHY)
                .bookSize(BookSize.STANDARD_A4)
                .bookNumberOfPages(330)
                .bookReleaseYear("1981")
                .bookLanguage("French")
                .markThickCover()
                .bookState(new BookAvailable())
                .build();

        kniga1.reportState();

    }

}
