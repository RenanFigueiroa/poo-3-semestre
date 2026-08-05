public class PrintBook extends Book {

    private String publisher;
    private String isbn;

    public PrintBook(String title, String outhor, int year, String publisher, String isbn){

        super(title, outhor, year);
        this.publisher = publisher;
        this.isbn = isbn;

    }

    @Override
    public String toString(){

        return super.toString() + String.format("Editóra: %s%nISBN: %s",this.publisher,this.isbn);
    }
    
}
