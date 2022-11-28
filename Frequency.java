import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int a[] = new int[26];

        // string to array
        char[] charArray = st.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = (char) charArray[i];
            a[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0)
                System.out.println((char) (i + 'a') + " " + a[i]);
        }

        // using hashmap
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : charArray) {
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else
                mp.put(ch, 1);
        }
        System.out.println();
        System.out.println();
        for (Map.Entry en : mp.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
        }

    }
}