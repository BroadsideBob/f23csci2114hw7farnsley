//669171001
public class Farnsley28 {
    public static void main(String[] args) {
        long sum = 1;
        long increment = 2;
        long toAdd = 1;
        for(int i = 3; i <= 1001; i += 2){
            for(int j = 0; j < 4; j++){
                toAdd += increment;
                sum += toAdd;
            }
            increment += 2;
        }
        System.out.println(sum);
    }
}
