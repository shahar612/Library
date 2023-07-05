public abstract class NonScientificBook extends Book {
    protected String date;

    public NonScientificBook(String name, int pagesNum, String date) {
        super(name, pagesNum);
        this.setDate(date);
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
