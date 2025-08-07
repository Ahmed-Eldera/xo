import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int[] arr = new int[a];
            int t=0;
            for(int i =0;i<arr.length;i++){
                arr[i]=s.nextInt();
                t+=arr[i];
            }
            int x = s.nextInt();
            int y = s.nextInt();
            if(t<x) {
                System.out.println(0);
                return;
            }
            int t2=0;
            for(int i =0;i<arr.length-1;i++){
                t2+=arr[i];
                if(t2>=x && t-t2 >=x && t2<=y && t-t2<=y){
                    System.out.println(i+2);
                    return;
                }
            }
            System.out.println(0);
    }

}