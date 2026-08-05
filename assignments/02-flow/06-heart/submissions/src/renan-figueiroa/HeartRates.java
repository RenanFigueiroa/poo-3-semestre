import java.time.LocalDate;
import java.time.Period;

public class HeartRates{      

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;
    private int maxHeartRate;
    private int[] targetHeartRate; 
    
    public HeartRates(String firstName,String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;

        this.age = calculateAge();
        this.maxHeartRate = calculateMaxHeartRate();
        this.targetHeartRate = calculateTargetHeartRate();

    }

    public  int calculateAge(){
        
        LocalDate dateOfBirth = LocalDate.of(this.yearOfBirth,this.monthOfBirth,this.dayOfBirth);
        LocalDate today = LocalDate.now();

        Period age =Period.between(dateOfBirth, today);

        return age.getYears();
    }

    public  int calculateMaxHeartRate(){

        int MBPM = 200 -this.age;

        return MBPM;
    }

    public  int[] calculateTargetHeartRate(){

        int maxFrequency = (int) (this.maxHeartRate * 0.5);
        int minFrequency = (int) (this.maxHeartRate * 0.85);

        return new int[] {minFrequency,maxFrequency};
    }


        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

       public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(int maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public int[] getTargetHeartRate() {
        return targetHeartRate;
    }

    public void setTargetHeartRate(int[] targetHeartRate) {
        this.targetHeartRate = targetHeartRate;
    }

}