//31875000
public class Farnsley9 {
    public static void main(String[] args) {
        boolean foundYou = false;
        int c;
        int b;
        int a;
        for(c = 3; !foundYou; c++){
            for(b = 2; b < c; b++){
                for(a = 1; a < b; a++){
                    if(a*a + b*b == c*c && a + b + c == 1000){
                        System.out.println(a*b*c);
                        foundYou = true;
                    }
                }
                a = 1;
            }
            b = 2;
        }   
    }
}
