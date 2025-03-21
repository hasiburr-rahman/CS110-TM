package packageForBook;

public class book {
    private int isbn;
    private String title;
    private int pages;
    static int count = 1;

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }

    static void displayAll(book i){
         System.out.print("ISBN: " + i.isbn);
         System.out.print("Title: " + i.title);
         System.out.println("Pages: " + i.pages);
         System.out.println("Count: " + count);
         count++;
    }

    public int compareTo(book book){
        if(this.pages > book.pages){
            return 1;
        } else if (this.pages == book.pages) {
            return 0;
        } else {
            return -1;
        }
    }


}
