import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            List<Integer> l = new ArrayList<>();
            for(int i =0;i<n;i++){
                    l.add(s.nextInt());
            }
            Collections.sort(l);
            for(int i =0;i<l.size();i++){
                    System.out.print(l.get(i)+" ");
            }
    }
}