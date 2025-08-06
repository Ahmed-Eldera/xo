import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int i = 0;
            while(a<=b){
                    i++;
                    a*=3;
                    b*=2;
            }
            System.out.println(i);
    }
}