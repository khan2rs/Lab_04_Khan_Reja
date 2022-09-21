public class MonthlyCCBalance {
    public static void main(String[] args) {

        double balance = 5000;
        double INTEREST_RATE = 0.17;
        double firstMonthsInterest = balance + INTEREST_RATE;
        double secondMonthsInterest = (balance + firstMonthsInterest) + INTEREST_RATE;
        System.out.println("Your first month's interest payment is $ " + firstMonthsInterest);
        System.out.println("Your second months interest payment is $ " + secondMonthsInterest);

    }
}
