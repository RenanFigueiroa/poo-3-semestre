public class PalindromeChecker{

    public boolean isValidInput(String input){

        int lengthInput = input.length();

        if( lengthInput == 0){
            return false;
        }else{
            return true;
        }
    }


    public boolean isPalindrome(String input){

        int lengthInput = input.length();

        String inputInverted = "";
        for(int i = lengthInput-1; i>=0; i--){
            int j =0;
            input.charAt(i);
            inputInverted += input.charAt(i);
        }

        for(int i = 0; i<lengthInput; i++){

            if(input.charAt(i)!= inputInverted.charAt(i)){

                return false;
            }
        }

        return true;
    }

}