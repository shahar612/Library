public abstract class NonScientificBook extends Book {
    protected String date;

    public NonScientificBook(String name, int pagesNumber, String author) {
        super(name, pagesNumber);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return this.date;
    }

    public void setAuthor(String date) {
        this.date = date;
    }
}
