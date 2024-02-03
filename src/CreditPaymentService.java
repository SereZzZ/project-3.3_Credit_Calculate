public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, double theInterestRate) {

        double percent = theInterestRate / 12 / 100;
        int numberOfYears = loanTerm * 12;
        double ratio = (percent * (Math.pow(1 + percent, numberOfYears))) / ((Math.pow(1 + percent, numberOfYears) - 1));
        double annuityPayment = loanAmount * ratio;

        return (int) annuityPayment;


    }
}
