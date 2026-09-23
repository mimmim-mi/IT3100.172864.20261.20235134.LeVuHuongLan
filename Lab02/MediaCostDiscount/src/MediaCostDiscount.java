import java.util.Scanner;

public class MediaCostDiscount {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter size of price:");

        int n = keyboard.nextInt();

        double[] costs = new double[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            costs[i] = keyboard.nextDouble();
        }

        double max = costs[0];
        double min = costs[0];
        double total = 0;

        for (double cost : costs) {

            if (cost > max) {
                max = cost;
            }

            if (cost < min) {
                min = cost;
            }

            if (cost > 20) {
                total += cost * 0.9;
            } else {
                total += cost;
            }
        }

        System.out.println("Maximum cost: " + max);
        System.out.println("Minimum cost: " + min);
        System.out.println("Total after discount: " + total);

    }
}