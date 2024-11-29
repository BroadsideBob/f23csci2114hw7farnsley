//9183
import java.util.ArrayList;
import java.math.BigInteger;

public class Farnsley29 {
    public static void main(String[] args) {
        int a;
        int b;
        BigInteger pow = new BigInteger("1");
        ArrayList<BigInteger> uniques = new ArrayList<BigInteger>();

        for(int i = 2; i <= 100; i++){
            for(int j = 2; j <= 100; j++){
                a = i;
                b = j;
                pow = BigInteger.valueOf(1);
                for(int k = 1; k <= b; k++){
                    pow = pow.multiply(BigInteger.valueOf(a));
                }
                if(!uniques.contains(pow)){
                    uniques.add(pow);
                }
            }
        }
        System.out.println(uniques.size());
    }    
}
