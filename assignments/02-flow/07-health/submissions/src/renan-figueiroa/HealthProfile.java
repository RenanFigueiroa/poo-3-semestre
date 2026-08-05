import java.time.LocalDate;
import java.time.Period;


public class HealthProfile{

    private String firstName;
    private String lastName;
    private char gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;
    private int maxHeartRate;
    private int[] targetHeartRate;
    private double BMI;
    private double heightInInches; // altura
    private double weightInPounds; // peso


    public HealthProfile(String firstName, String lastName, char gender, int dayOfBirth, int monthOfBirth,
            int yearOfBirth, double heightInInches, double weightInPounds) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;

        this.age = calculateAge();
        this.maxHeartRate = calculateMaxHeartRate();
        this.targetHeartRate = calculateTargetHeartRate();
        this.BMI = calculateBMI();
        

    }


    public int calculateAge(){

        LocalDate dateOfBirth = LocalDate.of(this.yearOfBirth,this.monthOfBirth,this.dayOfBirth);
        LocalDate dateToday = LocalDate.now();

        Period age = Period.between(dateOfBirth,dateToday);

        return age.getYears();
    }

    public int calculateMaxHeartRate(){
        int maxHeartRate = 200 - this.age;
        return maxHeartRate;    
    }


    public int[] calculateTargetHeartRate(){
        int max = (int) (this.maxHeartRate * 0.85);
        int min = (int) (this.maxHeartRate * 0.5);

        return new int[]{min, max};
    }

    public double calculateBMI(){

        double BMI = (double) ((this.weightInPounds * 703)/ (this.heightInInches* this.heightInInches));

        return BMI;
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


    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
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


    public double getBMI() {
        return BMI;
    }


    public void setBMI(double bMI) {
        BMI = bMI;
    }


    public double getHeightInInches() {
        return heightInInches;
    }


    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }


    public double getWeightInPounds() {
        return weightInPounds;
    }


    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

}