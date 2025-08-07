import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int l = s.nextInt();
            int[] lines = new int[l];
            for(int i =0;i<l;i++){
                    lines[i]=s.nextInt();
            }
            int x=s.nextInt();
            int a,b;
            for(int i =0;i<x;i++){
                    a=s.nextInt()-1;
                    b=s.nextInt();
                    if(a>0)
                    lines[a-1]+=b-1;
                    if(a<l-1)
                    lines[a+1]+=lines[a]-b;
                    lines[a]=0;
            }
            for(int i =0;i<l;i++){
                    System.out.println(lines[i]);
            }

    }
}