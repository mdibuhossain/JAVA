import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        int[] aa = new int[10];
        int bb[] = new int[10];
        int cc[];
        int dd[] = { 3, 4, 45, 1, 2, };

        // sort normal array
        Arrays.sort(dd);
        for (int it : dd)
            System.out.print(it + " ");
        System.out.println();
        System.out.println(Arrays.toString(dd));

        ArrayList<Integer> EE = new ArrayList<>();
        EE.add(33);
        EE.add(15);
        EE.add(20);
        EE.add(34);
        EE.add(8);
        EE.add(12);

        // sort normal ArrayList
        Collections.sort(EE);
        for (Object it : EE)
            System.out.print(it + " ");
        System.out.println();
    }
}
