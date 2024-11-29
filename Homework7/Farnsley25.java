//4782
import java.math.BigInteger;

public class Farnsley25 {
    public static void main(String[] args) {
        BigInteger fibbo = new BigInteger("1");
        BigInteger temp1 = new BigInteger("1");
        BigInteger temp2 = new BigInteger("0");
        int index = 0;
        while(fibbo.toString().length() < 1000){
            index++;
            temp1 = fibbo;
            fibbo = temp1.add(temp2);
            temp2 = temp1;
        }
        index++;
        System.out.println(index);
    }
}