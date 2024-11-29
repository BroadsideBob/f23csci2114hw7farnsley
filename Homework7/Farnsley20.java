//648
import java.math.BigInteger;

public class Farnsley20 {
    public static void main(String[] args) {
        BigInteger product = new BigInteger("1");
        for(int i = 100; i > 1; i--){
            product = product.multiply(BigInteger.valueOf(i));
        }
        String productString = product.toString();
        int sum = 0;
        for(int i = 0; i < productString.length(); i++){
            sum += Integer.parseInt(productString.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
