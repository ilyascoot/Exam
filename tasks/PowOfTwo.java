public class PowOfTwo {
    public static String powOfTwo(int n){
        if (n == 0) return "NO";
        if (n==1) return "YES";
        if (n%2 == 0) return powOfTwo(n/2);
        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(powOfTwo(127));
    }
}
