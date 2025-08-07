import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            int x=0;
            for(int i = 0;i<a.length();i++){
                    if(a.charAt(i)<='Z')x++;
            }
//            System.out.println(x);
            if(x>a.length()/2) System.out.println(a.toUpperCase());
            else System.out.println(a.toLowerCase());
    }
}