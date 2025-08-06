import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int x= s.nextInt();
            int f = x%10;
            int e = (x/10);
        System.out.println(c(f)*c(e));
        }
        public static int c(int x){
        switch (x){
            case 0:
                return 2;
            case 1:
                return 7;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 2;
            case 7:
                return 5;
            case 8:
                return 1;
            case 9:
                return 2;

            default:
                return 10;
        }
        }

    }

//    && in.compareTo(out)<0