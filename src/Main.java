public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1000000; //Сумма кредита
        double interestRate = 9.99; //Процентная ставка в год
        int time = 36; //Срок кредита в месяцах
        double monthlyPayment = service.calculate(creditAmount, interestRate, time);
        System.out.printf("= %.2f", monthlyPayment);
    }
}
