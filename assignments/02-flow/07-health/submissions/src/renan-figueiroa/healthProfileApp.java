import java.util.Scanner;

public class healthProfileApp {
    
    public static String formatTextUser(HealthProfile user) {

        String gender = "Não especificado"; 
        
        switch (user.getGender()) {
            case 'M':
                gender = "Masculino";
                break;
            case 'F':
                gender = "Feminino";
                break; 
            default:
                break;
        }

        String text = String.format("Nome: %s %s%nGênero: %s%nData de nascimento: %d/%d/%d%nIdade: %d anos%nAltura: %.2f polegadas%nPeso: %.2f%nÍndice de Massa Corporal (BMI): %.2f%nFrequência cardíaca máxima: %d bpm%nFaixa de frequência cardíaca alvo: %d bpm - %d bpm",
            user.getFirstName(), 
            user.getLastName(), 
            gender, 
            user.getDayOfBirth(), 
            user.getMonthOfBirth(), 
            user.getYearOfBirth(), 
            user.getAge(), 
            user.getHeightInInches(), 
            user.getWeightInPounds(),
            user.getBMI(), 
            user.getMaxHeartRate(), 
            user.getTargetHeartRate()[0], 
            user.getTargetHeartRate()[1]  
        );

        return text; 
    }

    public static void main(String[] args){

        String firstName;
        String lastName;
        char gender; 
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        double heightInInches;
        double weightInPounds;

        String text;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu primeiro nome: ");
        firstName = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        lastName = input.nextLine();

        System.out.println("Digite seu gênero (M/F): ");
        gender = input.next().charAt(0);

        System.out.println("Digite sua data de nascimento (dia, mês e ano separados por espaço): ");
        dayOfBirth = input.nextInt();
        monthOfBirth = input.nextInt();
        yearOfBirth = input.nextInt();

        System.out.println("Digite sua altura em polegadas: ");
        heightInInches = input.nextDouble();

        System.out.println("Digite seu peso em libras: ");
        weightInPounds = input.nextDouble();

        HealthProfile user1 = new HealthProfile(firstName, lastName, gender, dayOfBirth, monthOfBirth, yearOfBirth, heightInInches, weightInPounds);

        text = formatTextUser(user1);

        System.out.println(text);

    }



}
