package state2;

public class Book {

    private int numberOfPages;
    private BookCategory category;
    private BookSize size;
    private String title;
    private String author;
    private boolean isThickCover;
    private String releaseYear;
    private String language;
    private BookState state;

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
        state = builder.state;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public BookSize getSize() {
        return size;
    }

    public void setSize(BookSize size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isThickCover() {
        return isThickCover;
    }

    public void setThickCover(boolean thickCover) {
        isThickCover = thickCover;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BookState getState() {
        return state;
    }

    public void setState(BookState state) {
        this.state = state;
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
                ", state=" + state +
                '}';
    }

    public void reportState(){
        state.reportState(this);
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
        private BookState state;

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

        public Builder bookState(BookState state){
            this.state = state;
            return this;
        }

        public Book build(){
            return new Book(this);
        }

    }


}
