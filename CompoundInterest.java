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

    public static void lis(){
        int max = 1;
        int[] arr = new int[12];
        arr[0] = 10;
        arr[1] = 3;
        arr[2] = 12;
        arr[3] = 7;
        arr[4] = 2;
        arr[5] = 9;
        arr[6] = 11;
        arr[7] = 20;
        arr[8] = 12;
        arr[9] = 13;
        arr[10] = 6;
        arr[11] = 8;

        int[] dp = new int[12];
        for(int i =0; i < dp.length; i++){
            dp[i] = 1;
        }

        for(int i = 1; i < dp.length; i++){

            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);


                }
            }
//            dp[i] = maxi;
//            System.out.println(dp[i]);

        }

        for(int i =0; i < dp.length; i++){
            System.out.println(dp[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

    public static void main(String args[]){
        lis();
    }
}
