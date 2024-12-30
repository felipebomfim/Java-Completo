

import java.util.Locale;
import java.util.Scanner;

public class AverageHeightMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] heights = new double[n];
        double sum = 0;

        for (int i=0; i<n; i++) {
            heights[i] = sc.nextDouble();
            sum+=heights[i];
        }

        double average = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f\n", average);

        sc.close();
    }
}
