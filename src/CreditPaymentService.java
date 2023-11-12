public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm, double percent) {
        double creditRatio = percent * 1 / 12 / 100; // стандартный коэффициент 1/12 и перевод в абсолютное значение из процентов
        double payment = creditAmount * (creditRatio + creditRatio / (Math.pow(1 + creditRatio, creditTerm) - 1));
        return (int) payment;

    }

}
