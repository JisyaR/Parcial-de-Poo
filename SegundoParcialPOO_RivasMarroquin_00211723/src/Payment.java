public class Payment {
    private String recipient;
    private double amount;
    private String currency;
    private PaymentProvider provider;

    private Payment(PaymentBuilder builder) {
        this.recipient = builder.recipient;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.provider = builder.provider;
    }

    // Getters

    public String getRecipient() {
        return recipient;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public PaymentProvider getProvider() {
        return provider;
    }

    // PaymentBuilder

    public static class PaymentBuilder {
        private String recipient;
        private double amount;
        private String currency;
        private PaymentProvider provider;

        public PaymentBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public PaymentBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public PaymentBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public PaymentBuilder setProvider(PaymentProvider provider) {
            this.provider = provider;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
