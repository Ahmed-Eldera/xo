import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int b = s.nextInt();
            int d = s.nextInt();
            int i ;
            int sum=0;
            int cnt=0;
            while(n--!=0){
                    i=s.nextInt();
                    if(i>b){
                            continue;
                    }
                    sum+=i;
                    if(sum>d){
                            sum=0;
                            cnt++;
                    }
            }
            System.out.println(cnt);

    }
}