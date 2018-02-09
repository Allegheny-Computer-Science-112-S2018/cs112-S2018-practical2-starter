package practicaltwo;

import java.text.DecimalFormat;

/**
 * This class provides static methods that calculate statistical values.
 *
 * @author Gregory M. Kapfhammer
 */
public class StatisticsCalculator {

  public static Double calculateArithmeticMean(Double[] timings) {
    double runningTotal = 0.0;
    for (int i = 0; i < timings.length; i++) {
      runningTotal = runningTotal + timings[i];
    }
    return runningTotal / (double)timings.length;
  }

  /**
   * Calculates the variance of Double values in an array.
   *
   * @param timings the list of Double values from timing an algorithm
   */
  public static Double calculateVariance(Double[] timings) {
    Double arithmeticMean = calculateArithmeticMean(timings);
    Double runningTotal = 0.0;
    // TODO: Add for loop and correct computation here
    return runningTotal / ((double)timings.length - 1);
  }

  /**
   * Calculates the standard deviation of Double values in an array.
   *
   * @param timings the list of Double values from timing an algorithm
   */
  public static Double calculateStandardDeviation(Double[] timings) {
    return Math.sqrt(calculateVariance(timings));
  }

  /**
   * Create an array of double values and then calculate statistics.
   */
  public static void main(String[] args) {
    Double[] values = {12.5, 6.2, 1.5, 2.9, 10.8};
    System.out.println("Displaying the values in the array.");
    ArrayPrinter.print(values);
    Double arithmeticMean = StatisticsCalculator.calculateArithmeticMean(values);
    Double variance = StatisticsCalculator.calculateVariance(values);
    Double standardDeviation = StatisticsCalculator.calculateStandardDeviation(values);
    DecimalFormat formatter = new DecimalFormat("#.00");
    System.out.println("Displaying the output with two decimal places.");
    System.out.println("This is the arithmetic mean: " + formatter.format(arithmeticMean));
    System.out.println("This is the variance: " + formatter.format(variance));
    System.out.println("This is the standard deviation: " + formatter.format(standardDeviation));
  }

}
