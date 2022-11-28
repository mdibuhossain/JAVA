import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Palindrom_in_file {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int line = 1;
        while (sc.hasNext()) {
            String st = sc.nextLine();
            String[] stArray = st.split(" ");
            for (String ss : stArray) {
                String tmp = new StringBuilder(ss).reverse().toString();
                if (ss.equals(tmp)) {
                    System.out.println("line: " + line + " Palindrom " + ss);
                }
            }
            line++;
        }
    }
}
