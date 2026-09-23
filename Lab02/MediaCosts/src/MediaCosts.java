import java.util.Arrays;
import java.util.Scanner;

public class MediaCosts {
    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.println("Enter size of array: ");
        int n = keyboard.nextInt();

        double[] costs = new double[n];

        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            costs[i] = keyboard.nextDouble();
        }

        Arrays.sort(costs);

        double sum = 0;

        for (double cost : costs) {
            sum += cost;
        }

        double average = sum / costs.length;

        System.out.print("Sorted costs:" + " ");
        for (double cost : costs) {
            System.out.print(cost + " ");
        }
        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}