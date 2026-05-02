import java.util.*;

class WordsWithLength2D {
    static String[] splitWords(String s) {
        return s.split(" ");
    }

    static int getLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    static String[][] build(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] res = build(splitWords(s));

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + Integer.parseInt(res[i][1]));
        }
    }
}