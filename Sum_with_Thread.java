import java.util.Scanner;

class Data {
    static long summation = 0L;
}

class SumThread extends Thread {
    long start, end, value;

    SumThread(long start, long end) {
        value = 0;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            for (long i = start; i <= end; i++) {
                value += i;
            }
        } catch (Exception er) {
        }
    }

    public long getValue() {
        return value;
    }
}

public class Sum_with_Thread {
    public static void main(String[] args) {
        SumThread[] T = new SumThread[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("1 to ? ");
        long value = sc.nextLong();
        long diff = value / 10;
        try {
            long start = 1;
            long end = diff;
            for (int i = 0; i < 10; i++) {
                T[i] = new SumThread(start, end);
                T[i].start();
                start += diff;
                end = start + diff - 1;
            }

            for (int i = 0; i < 10; i++) {
                T[i].join();
            }

            for (int i = 0; i < 10; i++) {
                Data.summation += T[i].getValue();
            }
        } catch (Exception er) {
        }
        System.out.println("Total sum 1 to " + value + " = " + Data.summation);
    }
}