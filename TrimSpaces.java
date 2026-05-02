import java.util.*;

class TrimSpaces {
    static int[] trim(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    static String sub(String s, int start, int end) {
        String r = "";
        for (int i = start; i <= end; i++) r += s.charAt(i);
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] r = trim(s);
        String t1 = sub(s, r[0], r[1]);
        String t2 = s.trim();

        System.out.println(compare(t1, t2));
    }
}