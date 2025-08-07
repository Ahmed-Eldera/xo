import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
//            int min = (int) Math.sqrt(Math.min(a,Math.min(b,c)));
//            int max= Math.max(a,b)/min;
            double t =  Math.sqrt((long)a*b*c);
            double aa=(t/a);
            double bb=t/b;
            double cc=t/c;
        System.out.println((int)(aa*4+bb*4+cc*4));
    }

}