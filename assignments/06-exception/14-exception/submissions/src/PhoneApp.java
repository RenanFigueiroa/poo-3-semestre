
public class PhoneApp{

    public static void main(String[] args ){

        try {
           Phone phone1 = new Phone("","1234567890123456"); 

           System.out.println("Objeto construido com sucesso");
        } catch ( ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
           Phone phone2 = new Phone("iphone","12345"); 

           System.out.println("Objeto construido com sucesso");
        } catch ( ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
           Phone phone3 = new Phone("iphone","1234567890123456"); 

           System.out.println("Objeto construido com sucesso");
        } catch ( ValidationException e) {
            System.out.println(e.getMessage());
        }


    }
}