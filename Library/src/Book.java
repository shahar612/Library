

public abstract class Book implements Comparable {
    protected String bookName;
    protected int pageNumber;

    public Book(String bookName, int pageNumber) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Object o) {
        return this.getBookName().compareTo(((Book)o).getBookName()) ;
    }
}

