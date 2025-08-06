import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            if(b==0 ) {
                    if(a==1){
                    System.out.println(0);
                    return;}
                    else {
                            System.out.println("No solution");
                            return;
                    }
            }
            long start = 1;
            System.out.print(b);
            for(int i =1;i<a;i++) System.out.print(0);
    }
    public static int dr(Long n) {
            int sum = 0;
            while (n > 0) {
                sum+=n%10;
                n/=10;
            }
            if(sum>=10)return dr((long) sum);
            return sum;
    }

}