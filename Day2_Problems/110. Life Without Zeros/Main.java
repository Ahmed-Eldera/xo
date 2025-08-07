import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String f = s.nextLine();
            String e = s.nextLine();
        int total1 =Integer.parseInt(f) +Integer.parseInt(e);
//                for (int i = 0; i < Math.min(f.length(), e.length()); i++) {
////                System.out.println(f.charAt(f.length()-i-1) + "+"+e.charAt(e.length()-i-1) + "=" + (int)f.charAt(f.length()-i-1)+e.charAt(e.length()-i-1));
////                    if ((int) (f.charAt(f.length() - i - 1) - '0') + (int) (e.charAt(e.length() - i - 1) - '0') < 10) {
//                        if (f.charAt(f.length() - i - 1) == '0' || e.charAt(e.length() - i - 1) == '0') {
//                            if (f.charAt(f.length() - i - 1) == '0' && e.charAt(e.length() - i - 1) == '0') {
//                                continue;
//                            } else {
//                                System.out.println("NO");
//                                return;
//                            }
//                        }
////                    } else {
////                        System.out.println("NO");
////                        return;
////                    }
//                }

        f=f.replace("0","");
        e=e.replace("0","");
        int total =Integer.parseInt(f) +Integer.parseInt(e);
        if(Integer.parseInt( Integer.toString(total1).replace("0","")) !=total ){
        System.out.println("NO");
                            return;
        }
        System.out.println("YES");
    }

    }

//    && in.compareTo(out)<0