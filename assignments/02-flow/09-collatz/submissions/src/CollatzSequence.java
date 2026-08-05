public class CollatzSequence {
    
    public static int nextCollatz(int n){

        if(n%2==0){
            n /= 2;
        }else{
            n = (n*3) + 1;
        }

        return n;
    }

    public int calculateCollatzSum(int n){

        int soma =n, atual =n;
        
        System.out.print(n);
        while(atual != 1){

            atual= nextCollatz(atual);
            soma +=atual;

            System.out.print(String.format(" → %d", atual));
        }
        System.out.println("");

        return soma;
    }

}
