public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int myMonthlyPayment_1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ваш ежемесячный плотёж: " + myMonthlyPayment_1 + " руб.");

        int myMonthlyPayment_2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ваш ежемесячный плотёж: " + myMonthlyPayment_2 + " руб.");

        int myMonthlyPayment_3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ваш ежемесячный плотёж: " + myMonthlyPayment_3 + " руб.");


    }
}