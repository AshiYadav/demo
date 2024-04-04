public class SimpleInterest {

    public static double calculate(int principal, int rateOfInterest, int timeInYears){
        double simpleInterest = (principal * rateOfInterest * timeInYears) / 100;

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
        return simpleInterest;
    }
}
