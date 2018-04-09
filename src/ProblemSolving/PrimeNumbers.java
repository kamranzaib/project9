package ProblemSolving;
public class PrimeNumbers {

    public static void main (String[] args) {
        int counter = 0;
        for(int i=2; i <= 100; i++){
            if(isPrime(i)){
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("total primes :" + counter);
    }
    public static boolean isPrime (int n){
        if(n % 2 == 0) return false;
        for(int i=3; i*i<=n; i+=2){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}