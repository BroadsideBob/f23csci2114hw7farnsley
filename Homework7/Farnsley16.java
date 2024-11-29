//1366
import java.math.BigInteger;

public class Farnsley16 {
    public static void main(String[] args) {
        int sum = 0;
        BigInteger num = new BigInteger("2").pow(1000);
        for(int i = 0; i < num.toString().length(); i++){
            sum += Integer.parseInt(num.toString().substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
