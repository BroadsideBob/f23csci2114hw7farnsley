//4613732
public class Farnsley2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        int x = 0;
        for(int i = 0; i < 4000000; i = x + n){
            if(i % 2 == 0){
                sum += i;
            }
            x = n;
            n = i;
        }
        System.out.println(sum);
    }
}
