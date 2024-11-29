//25164150
public class Farnsley6 {
    public static void main(String[] args) {
        int sumNum = 0;
        int sumNat = 0;

        for(int i = 0; i <= 100; i++){
            sumNum += i * i;
            sumNat += i;
        }

        sumNat *= sumNat;

        System.out.println(sumNat - sumNum);
    }
}
