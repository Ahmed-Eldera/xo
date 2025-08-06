import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
//            int b = s.nextInt();
            int row = 0;
            int col = 0;
            outer:
            for(int i = 0;i<5;i++){
                for(int j = 0;j<5;j++){
                    int a = s.nextInt();
                    if(a==1) {
                            row = i + 1;
                            col = j+1;
                            break outer;
                    }

                }
            }
            // System.out.println(row);
            // System.out.println(col);
            System.out.println(Math.abs(row-3)+Math.abs(col-3));
    }
}