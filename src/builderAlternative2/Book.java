package builderAlternative2;

public class Book {

    private int numberOfPages;
    private BookCategory category;
    private BookSize size;
    private String title;
    private String author;
    private boolean isThickCover;
    private String releaseYear;
    private String language;

    /** empty private constructor to make it impossible to create a Book object without Builder*/
    private Book() {}

    private Book(Builder builder){
        if (builder == null){
            return;
        }
        numberOfPages = builder.numberOfPages;
        category = builder.category;
        size = builder.size;
        title = builder.title;
        author = builder.author;
        isThickCover = builder.thickCover;
        releaseYear = builder.releaseYear;
        language = builder.language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", category=" + category +
                ", size=" + size +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isThickCover=" + isThickCover +
                ", releaseYear='" + releaseYear + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    /** inner class - Builder */
    public static class Builder{

        private int numberOfPages;
        private BookCategory category;
        private BookSize size;
        private final String title;
        private String author;
        private boolean thickCover;
        private String releaseYear;
        private String language;

        public Builder(String title){
            this.title = title;
        }

        public Builder bookCategory(BookCategory category){
            this.category = category;
            return this;
        }

        public Builder bookNumberOfPages(int numberOfPages){
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Builder bookSize(BookSize size){
            this.size=size;
            return this;
        }

        public Builder bookAuthor(String author){
            this.author = author;
            return this;
        }

        public Builder markThickCover(){
            this.thickCover = true;
            return this;
        }

        public Builder bookReleaseYear(String releaseYear){
            this.releaseYear = releaseYear;
            return this;
        }

        public Builder bookLanguage(String language){
            this.language = language;
            return this;
        }

        public Book build(){
            return new Book(this);
        }

    }


}
