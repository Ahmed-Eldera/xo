import java.util.Scanner;
 
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();
            String inp=s.nextLine();
            inp= s.nextLine();
//            System.out.println(inp);
            int A = 0;
            int D = 0;
            while(i>0){
                    i--;
                    if(inp.charAt(i)=='A')A++;
                    else D++;
            }
            if(A>D) System.out.println("Anton");
            else if(A==D) System.out.println("Friendship");
            else System.out.println("Danik");
    }
}