import java.util.*;

class VowelConsonantCount {
    static boolean isVowel(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    static int[] count(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] r = count(s);
        System.out.println(r[0] + " " + r[1]);
    }
}