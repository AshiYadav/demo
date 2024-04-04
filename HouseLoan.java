public class HouseLoan {

    public static double calculateHouseLoan(int annualInterestRate, int loanTermYears, int principal){

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Convert loan term to months
        int loanTermMonths = loanTermYears * 12;

        // Calculate monthly payment
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        // Display the result
        System.out.println("Monthly Payment: " + monthlyPayment);

        return monthlyPayment;
    }
}
