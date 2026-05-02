import java.util.*;

class UniqueCharacters {
    static String unique(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(unique(s));
    }
}