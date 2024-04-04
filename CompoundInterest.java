public class CompoundInterest {

    public static double calculateCompoundInterest(int rateOfInterest, int timeInYears, int principal){
        double monthlyRateOfInterest = rateOfInterest / 100 / 12;

        // Input time duration in years
        System.out.print("Enter time duration (in years): ");

        // Convert time duration to months
        double timeInMonths = timeInYears * 12;

        // Calculate compound interest
        double compoundInterest = principal * Math.pow(1 + monthlyRateOfInterest, timeInMonths) - principal;

        // Display the result
        System.out.println("Compound Interest: " + compoundInterest);

        return compoundInterest;
    }
}
