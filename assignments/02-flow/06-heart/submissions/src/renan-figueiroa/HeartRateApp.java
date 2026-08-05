import java.util.Scanner;

public class HeartRateApp {

    public static String formatExit(HeartRates user){
        
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        int age = user.getAge();
        int MBPM = user.getMaxHeartRate();
        int day = user.getDayOfBirth();
        int month = user.getMonthOfBirth();
        int year = user.getYearOfBirth();
        int[] targetHeartRate = user.getTargetHeartRate();
        
        String text = String.format("Nome: %s %s%nData de nascimento: %d/%d/%d%nIdade: %d anos%nFrequência cardíaca máxima: %d bpm%nFaixa de frequência cardíaca alvo: %d bpm - %d bpm",
        firstName,lastName, day,month,year, age,MBPM, targetHeartRate[0], targetHeartRate[1]);

        return text;
    }
    
    public static void main(String[] args){

        String firstName;
        String lastName;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        firstName = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        lastName = input.nextLine();

        System.out.println("Digite sua data de nascimento (dia, mês e ano separados por espaço): ");
        dayOfBirth = input.nextInt();
        monthOfBirth = input.nextInt();
        yearOfBirth = input.nextInt();

        HeartRates user1 = new HeartRates(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);

        String text = formatExit(user1);
        System.out.println(text);

        input.close();
    }

}


