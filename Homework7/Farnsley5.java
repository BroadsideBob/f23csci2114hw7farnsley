//232792560
public class Farnsley5 {
    public static void main(String[] args) {
        int x = 0;
        boolean findSmallest = false;
        while(!findSmallest){
            x += 20;
            findSmallest = true;
            if(x % 3 != 0 || x % 6 != 0 || x % 7 != 0 || x % 8 != 0 || x % 9 != 0 || x % 11 != 0 || x % 12 != 0 || x % 13 != 0 || x % 14 != 0 || x % 15 != 0 || x % 16 != 0 || x % 17 != 0 || x % 18 != 0 || x % 19 != 0){
                findSmallest = false;
            }
        }
        System.out.println(x);
    }
}
    
    
