public class ReadingBook extends NonScientificBook {
    protected int price;
    private final static int PRICE_FACTOR = 3;

    public ReadingBook(String name, int pagesNumber, String author) {
        super(name, pagesNumber, author);
        this.setPrice(pagesNumber * PRICE_FACTOR);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
