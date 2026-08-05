public class BookApp {
    
    public static void main(String[] args){

        Book livro = new Book("Linha de Frente", "RendouFig", 2026);

        AudioBook audioLivro = new AudioBook("Banana","fulano", 2005, 26, 3,"narrador");

        PrintBook livroPublicado = new PrintBook("Pera", "Sicrano", 2000,"Livraria","262614654" );

        System.out.println("Book");
        System.out.println(livro);

        System.out.println("AudioBook");
        System.out.println(audioLivro);

        System.out.println("PrintBook");
        System.out.println(livroPublicado);





    }


}
