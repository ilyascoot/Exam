package bilet4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean hasOdd(HashSet set){
        for (Object elem: set) {
            if (((int) elem) % 2 != 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(hasOdd(set));



    }
}
