import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine().toLowerCase();
            String b = s.nextLine().toLowerCase();

            for(int i =0;i<a.length();i++){
                    if(a.charAt(i)>b.charAt(i)){
                            System.out.println(1);
                            return;
                    }
                    else if(a.charAt(i)<b.charAt(i))
                    {System.out.println(-1);
                                                return;
                    }
            }
            System.out.println(0);
    }
}