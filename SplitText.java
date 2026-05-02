import java.util.*;

class SplitText {
    static String[] splitWords(String s) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ' ') spaces++;

        String[] res = new String[spaces + 1];
        String word = "";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res[idx++] = word;
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        res[idx] = word;
        return res;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] a = splitWords(s);
        String[] b = s.split(" ");

        System.out.println(compare(a, b));
    }
}