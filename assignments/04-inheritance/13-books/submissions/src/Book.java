public class Book{

    public String title;
    public String outhor;
    public int year;

    public Book(String title, String outhor, int year){
        this.title = title;
        this.outhor = outhor;
        this.year = year;
    }

    @Override
    public String toString(){

        return String.format("Título do livro: %s%nAno do livros: %d%nAutor do livros: %s", this.title, this.year, this.outhor);
    }

}