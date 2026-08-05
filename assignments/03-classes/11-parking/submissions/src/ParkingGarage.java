public class ParkingGarage{
    
    public static double calculateCharges(double hours){

        double tax;
        if(hours < 3){
            tax = 2.0;
            return tax;
        }else{
            tax = 2.0 +((hours - 3)* 0.5);
            if(tax>10){
                return 10;
            }else{
                return tax;                
            }
        }
    }
}