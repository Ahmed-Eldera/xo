import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine().toLowerCase();
            List<Character> l = new ArrayList<>();
            for(int i = 0 ; i < a.length();i++){
                    if(!l.contains(a.charAt(i)))l.add(a.charAt(i));
            }
            if(l.size()%2==0) System.out.println("CHAT WITH HER!");
            else System.out.println("IGNORE HIM!");
    }
}