import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            String b=s.nextLine();
//            b=b.nextLine();
            int cnt=0;
//            a--;
            while(a-->0){
                String z=s.nextLine();
//                    System.out.println(cnt);
                if(!z.equals(b))cnt++;
                b=z;
            }
            System.out.println(cnt);
    }
}