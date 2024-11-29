//104743
public class Farnsley7 {
    public static void main(String[] args) {
        boolean reached10001 = false;
        int count = 0;
        for(int i = 2; !reached10001; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
            if(count == 10001){
                reached10001 = true;
                System.out.println(i);
            }
        }
    }
}
