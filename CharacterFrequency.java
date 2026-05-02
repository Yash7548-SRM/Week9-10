import java.util.*;

class CharacterFrequency {
    static String[][] freq(String s) {
        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        String[][] r = new String[s.length()][2];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (f[s.charAt(i)] > 0) {
                r[k][0] = String.valueOf(s.charAt(i));
                r[k][1] = String.valueOf(f[s.charAt(i)]);
                f[s.charAt(i)] = 0;
                k++;
            }
        }

        return Arrays.copyOf(r, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] r = freq(s);

        for (String[] x : r)
            System.out.println(x[0] + " " + x[1]);
    }
}