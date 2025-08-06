import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int cnt=0;
            while(a>0 && b> 0) {
                if(a==1 && b==1)break;
                cnt++;
                if (a > b) {
                    a -= 2;
                    b++;
                } else {
                    b -= 2;
                    a++;
                }
            }
        System.out.println(cnt);
    }

}