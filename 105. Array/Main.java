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
                if(inp<0 && l1.size()==0){
                    l1.add(inp);

                }

                else if(inp < 0){
                    l3.add(inp);

                }
                else if(inp>0)l2.add(inp);
            }

            int i1;
            if(l3.size()%2==0){
                i1=0;

            }
            else{
                i1=1;
            }
            for(;i1<l3.size();){
                    l2.add(l3.getFirst());
                    l3.removeFirst();
            }
        System.out.println(1 + " " + l1.getFirst() + " ");
        System.out.print(l2.size()+" ");
            for(int i = 0; i < l2.size();i++){
                System.out.print(l2.get(i) + " ");
            }
        System.out.println();
        System.out.print(l3.size()+1+" 0 ");
            for(int i = 0; i < l3.size();i++){
                System.out.print(l3.get(i) + " ");
            }

    }

}