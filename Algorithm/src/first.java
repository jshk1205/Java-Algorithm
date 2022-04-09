import java.util.Scanner;
import java.util.StringTokenizer;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        System.out.println(str);
        StringTokenizer con = new StringTokenizer(str," ");
        System.out.println(con.countTokens());
    }
}
