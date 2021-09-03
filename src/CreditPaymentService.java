public class CreditPaymentService {
    public double calculate(int creditAmount, double interestRate, int time) {
        double interestRateMonth = interestRate / 100.0000 / 12; // Процентная ставка в месяц
        int timeNew = -1 * time;
        double monthlyPayment = creditAmount * (interestRateMonth / (1 - Math.pow(1 + interestRateMonth, timeNew)));
        return monthlyPayment;
    }
}
