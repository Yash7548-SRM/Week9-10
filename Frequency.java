import java.util.*;

class Frequency {
    static String unique(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (!r.contains("" + s.charAt(i)))
                r += s.charAt(i);
        }
        return r;
    }

    static String[][] freq(String s) {
        String u = unique(s);
        String[][] r = new String[u.length()][2];

        for (int i = 0; i < u.length(); i++) {
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (u.charAt(i) == s.charAt(j)) c++;
            }
            r[i][0] = String.valueOf(u.charAt(i));
            r[i][1] = String.valueOf(c);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (String[] x : freq(s))
            System.out.println(x[0] + " " + x[1]);
    }
}