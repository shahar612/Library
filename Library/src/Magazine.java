public class Magazine extends NonScientificBook {
    private final static int PAGES_IN_SHEET = 2;

    public Magazine(String name, int pagesNumber, String author) {
        super(name, pagesNumber * PAGES_IN_SHEET, author);
    }
}
