import java.util.*;

class ShortestLongestWord {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);

        String min = words[0], max = words[0];

        for (String w : words) {
            if (getLength(w) < getLength(min)) min = w;
            if (getLength(w) > getLength(max)) max = w;
        }

        System.out.println(min);
        System.out.println(max);
    }
}