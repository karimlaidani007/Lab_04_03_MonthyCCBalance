public class Main {
    public static void main(String[] args) {

        double balance = 5000.00;
        double apr = 0.17; // 17% annual rate


// After 1 month
        double interestMonth1 = balance * apr;
        double balanceAfter1 = balance + interestMonth1;

// After 2 months (no payments)
        double interestMonth2 = balanceAfter1 * apr;
        double balanceAfter2 = balanceAfter1 + interestMonth2;



        System.out.println("The interest for the first month is " + interestMonth1);
        System.out.println("The interest for the second month is " + interestMonth2);
    }
}