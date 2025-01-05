public class Main {
    public static void main(String[] args) {

        // Given runner lap data
        double[][] times = {
                {64.791, 75.972, 68.950, 79.039, 73.006, 74.157},
                {67.768, 69.334, 70.450, 67.667, 75.686, 76.298},
                {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};


        //each row = 1 runner;
        // each column = time data of each

        double runnerTime = 0.0;
        for(int outer = 0; outer < times.length; outer++) {
            runnerTime = 0.0;
            for(int inner = 0; inner < times[outer].length; inner++) {
                System.out.println("Runner index: " + outer + ", Time index: " + inner);
                runnerTime += times[outer][inner];
                // Add a line to sum up the values in each row.

            }
            double averageVal = 0;
            averageVal = runnerTime / times[outer].length;
            //the runner time that we have calculated divided by the timing length of each row means each person
            System.out.println("Sum of runner " + outer + " times: " + runnerTime);
            System.out.println("Average of runner " + outer + ": " + averageVal);
        }
    }
}