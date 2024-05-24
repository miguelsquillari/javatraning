package training.alg;

public class Fibonacci {

    private int setSec = 10;
    public  Fibonacci (){
        System.out.println("--> "+ fibonacci(setSec));
    }

    private long fibonacci(int n){
        if (n <= 1){
            return n;
        }
        long l =  fibonacci(n-1) + fibonacci(n -2);
        return l;
    }


    public static void main (String args[]){

        new Fibonacci();
    }
}
