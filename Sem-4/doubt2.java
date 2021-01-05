import java.util.*; // modified

public class doubt2 {
    public static void main(String args[]) {
        Scanner I = new Scanner(System.in);
        int n, i = 0, j, k, c = 0;
        String s = I.next();
        n = Integer.parseInt(s);
        for (k = 0; k < n; k++, c = 0, i = 0) {
            s = I.nextLine();
            while (i != s.length()) {
                for (j = i + 1; j < s.length(); j++)
                    if (s.charAt(i) == '(' && s.charAt(j) == ')' || s.charAt(i) == '[' && s.charAt(j) == ']') {
                        c++;
                        break;
                    }
                if (j == s.length())
                    i++;
                else
                    s = s.substring(0, i) + s.substring(i + 1, j) + s.substring(j + 1);
            }
            System.out.println(c);
        }
    }
}