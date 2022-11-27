import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _19CSE065 {
    static Scanner scanner = new Scanner(System.in);

    static long mulmod(long a, long b, long m) {
        long res = 0;
        while (b > 0) {
            if (b % 2 != 0) {
                res = (res + a) % m;
            }
            a = (a * 2L) % m;
            b /= 2;
        }
        return res % m;
    }

    static long modpower(long a, long n, long m) {
        long res = 1;

        while (n > 0) {
            if ((n & 1L) == 1)
                res = mulmod(res, a, m);

            a = mulmod(a, a, m);
            n >>= 1;
        }
        return res;
    }

    static boolean checkP(long a, long n, long d, long s) {
        long x = modpower(a, d, n);
        if (x == 1 || x + 1 == n)
            return true;

        for (int i = 1; i < s; i++) {
            x = mulmod(x, x, n);

            if (x + 1 == n)
                return true;
        }
        return false;
    }

    static boolean MillerRabin(long n) {
        if (n < 4) {
            if (n == 2 || n == 3)
                return true;
            else
                return false;
        }
        long d = n - 1, s = 0;

        while (d % 2 == 0) {
            d /= 2;
            s++;
        }
        for (int i = 0; i < 5; i++) {
            long a = 2 + Math.random() % (n - 3);

            if (checkP(a, n, d, s) == true)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Long> inp = new ArrayList<Long>();
        long mn = Long.MAX_VALUE;
        long mx = Long.MIN_VALUE;
        try {
            for (int i = 1; i <= 9; i++) {
                String path = "input\\file" + Integer.toString(i) + ".txt";
                scanner = new Scanner(new File(path));
                while (scanner.hasNext()) {
                    long tmp = scanner.nextLong();
                    mx = Math.max(mx, tmp);
                    mn = Math.min(mn, tmp);
                }
            }
            // System.out.println(inp.size());
            System.out.println(mn);
            System.out.println(mx);
        } catch (Exception er) {
        }
    }
}