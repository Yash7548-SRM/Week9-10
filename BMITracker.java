import java.util.*;

class BMITracker {
    static String[][] compute(double[][] data) {
        String[][] r = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100;
            double bmi = w / (h * h);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            r[i][0] = String.valueOf(data[i][0]);
            r[i][1] = String.valueOf(data[i][1]);
            r[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
            r[i][3] = status;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] res = compute(data);

        for (String[] r : res) {
            System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);
        }
    }
}