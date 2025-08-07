import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] pos = new int[n];
            Map<Integer,Integer> apples = new HashMap<>();
            int less = 0;
            int more = 0;
            int total=0;

            for(int i =0;i<n;i++){
                pos[i]=s.nextInt();
                apples.put(pos[i],s.nextInt());
                if(pos[i]>0)more++;
                else less++;
            }
            int i =0;
            int x = 0;
            Arrays.sort(pos);
            while(i<n && pos[i]<0  ){
                    i++;
                }

            x=i;
            int steps=1;
        int sign = 1;

            while (i < n && i >= 0) {
                total += apples.get(pos[i]);
                i += -sign * steps++;
                sign *= -1;
            }

            i=x;
            i--;
            steps=1;
            sign=-1;
            int total2=0;
            while(i<n && i >=0){
                total2 += apples.get(pos[i]);
                i += -sign*steps++;
                sign*=-1;
            }


            System.out.println(Math.max(total,total2));


        }

    }