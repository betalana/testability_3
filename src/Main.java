public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 12, 9.99);
        System.out.println((payment) + " руб. в месяц, при сроке кредита 1 год");
        System.out.println();

        System.out.println(service.calculate(1_000_000, 24, 9.99) + " руб. в месяц, при сроке кредита 2 года");
        System.out.println();

        System.out.println(service.calculate(1_000_000, 36, 9.99) + " руб. в месяц, при сроке кредита 3 года");
        System.out.println();
    }
}
