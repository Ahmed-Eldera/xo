import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int i = 0;
            int n = s.nextInt();
            while(n!=0) {
                    int a = s.nextInt();
                    int b = s.nextInt();
                    int c = s.nextInt();
                    if (a + b + c > 1) i++;
                    n--;
            }
            System.out.println(i);
    }
}