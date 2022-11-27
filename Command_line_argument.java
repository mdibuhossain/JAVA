import java.util.Arrays;

// javac Command_line_argument.java
// java Command_line_argument 1 2 3 4 5 5 55 100 250 9999 ibrahim hossain akash
public class Command_line_argument {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        System.out.println((Object) args.getClass().getSimpleName());
        for (int i = 0; i < args.length; i++) {
            // Data type checking
            String type = ((Object) args[i]).getClass().getSimpleName();

            try {
                // parsing string to integer
                int prs = Integer.parseInt(args[i]);
                type = ((Object) prs).getClass().getSimpleName();
                System.out.println(prs + ", Type: " + type);
            } catch (Exception er) {
                System.out.println(args[i] + ", Type: " + type);
            }
        }
    }
}
