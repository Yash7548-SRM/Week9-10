import java.util.*;

class VowelConsonant{
    static String type(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        if (!(c >= 'a' && c <= 'z')) return "NotLetter";
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        return "Consonant";
    }

    static String[][] process(String s) {
        String[][] r = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            r[i][0] = String.valueOf(s.charAt(i));
            r[i][1] = type(s.charAt(i));
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[][] r = process(s);

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i][0] + " " + r[i][1]);
        }
    }
}