public class Main {
    public static void main(String[] args) {

        // Given runner lap data in a 2D array
        // Each row represents a runner, and each column represents the time for a specific lap
        double[][] times = {
                {64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, // Runner 0's lap times
                {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, // Runner 1's lap times
                {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}  // Runner 2's lap times
        };

        double runnerTime = 0.0; // Variable to hold the total time for a runner

        // Outer loop: Iterates through each runner
        for (int outer = 0; outer < times.length; outer++) {
            runnerTime = 0.0;  // Reset the total time for each runner

            // Inner loop: Iterates through each lap time for the current runner
            for (int inner = 0; inner < times[outer].length; inner++) {
                // Print the runner and lap indices for tracking
                System.out.println("Runner index: " + outer + ", Time index: " + inner);

                // Add the current lap time to the total time for this runner
                runnerTime += times[outer][inner];
            }

            // Calculate the average lap time for the current runner
            double averageVal = runnerTime / times[outer].length;

            // Print the total and average lap times for the current runner
            System.out.println("Sum of runner " + outer + " times: " + runnerTime);
            System.out.println("Average of runner " + outer + ": " + averageVal);
        }
    }
}
