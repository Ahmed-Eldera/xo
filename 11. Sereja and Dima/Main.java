import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int[] sum = new int[2];
            int turn = 0;
            int[] nums = new int[a];
            for(int i = 0;i<a;i++){
                    nums[i]=s.nextInt();
            }
            int f = 0;
            int e=nums.length-1;

            while(f<=e) {

                    if (nums[f]>=nums[e]) {
                            sum[turn] += nums[f];

                            f++;

                    }else {
                            sum[turn]+=nums[e];
                            e--;
                    }
                    turn=(turn+1)%2;
            }
            System.out.println(sum[0]+ " " + sum[1]);
    }
}