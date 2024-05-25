public class PaymentProcessor {
    public void process(Payment payment) {
        payment.getProvider().processPayment(payment);
    }
}
