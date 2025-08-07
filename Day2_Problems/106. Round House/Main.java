import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
//            int x = Math.abs(b+c);
//        System.out.println(x/a + x%a);
        if(c>=0){
                System.out.println((b+c)%(a)==0?a:(b+c)%a);

        }
        else {
            c=-c%a;
            System.out.println((b-c)>0?b-c:a+b-c);
        }

    }

}