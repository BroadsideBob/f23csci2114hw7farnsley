//142913828922
import java.util.ArrayList;

public class Farnsley10 {
    public static void main(String[] args) {
        long sum = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < 2000000; i++){
            boolean isPrime = true;
            for(int j = 0; j < primes.size(); j++){
                if(i % primes.get(j) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
                primes.add(i);
            }
        }
        System.out.println(sum);
    }
}
