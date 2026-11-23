import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String input = sc.next();
            BigInteger n = new BigInteger(input);

            boolean fitsByte  = n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0;
            boolean fitsShort = n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0;
            boolean fitsInt   = n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0;
            boolean fitsLong  = n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0;

            if (fitsByte || fitsShort || fitsInt || fitsLong) {
                System.out.println(n + " can be fitted in:");
                if (fitsByte)  System.out.println("* byte");
                if (fitsShort) System.out.println("* short");
                if (fitsInt)   System.out.println("* int");
                if (fitsLong)  System.out.println("* long");
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
