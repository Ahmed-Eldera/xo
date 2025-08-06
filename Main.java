import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            ArrayList<Integer> l3 = new ArrayList<>();
            int inp;
            while(a--!= 0){
                inp=s.nextInt();
                if(inp == 0){
                    l3.add(inp);

                }
                else if(inp<0 && l1.size()==0){
                    l1.add(inp);

                }
                else l2.add(inp);
            }
        System.out.println(1 + " " + l1.getFirst() + " ");
        System.out.print(l2.size()+" ");
            for(int i = 0; i < l2.size();i++){
                System.out.print(l2.get(i+1-1) + " ");
            }
        System.out.println();
        System.out.println(1+ " " + l3.getFirst());

    }

}