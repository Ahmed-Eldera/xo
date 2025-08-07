import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String word = s.nextLine();
            int n =s.nextInt();
//            String[] sz = new String[n];
            int min=Integer.MAX_VALUE;
            String in = s.nextLine();
            String out=word;
            while(n!=0){
                in = s.nextLine();

                if(in.startsWith(word)  ) {
                        out = in;
                        n--;
                        break;
                    }
                n--;
            }
            while(n!=0){
                in = s.nextLine();

                if(in.startsWith(word) && in.compareTo(out)<0 ) {
                        out = in;

                    }
                n--;
            }

System.out.println(out);

        }

    }

//    && in.compareTo(out)<0