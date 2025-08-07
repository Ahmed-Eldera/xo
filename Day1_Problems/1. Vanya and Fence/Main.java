import java.util.Scanner;
 
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int number = s.nextInt();
        int WallHeight = s.nextInt();
        int counter = 0;
        for(int i = 0; i < number;i++){
            int pHeight = s.nextInt();
            if(pHeight <= WallHeight){
                counter++;
            }else {
                counter +=2;
            }
 
        }
                    System.out.println(counter);
    }
}