package q3adapter;

/**
 * Created by peted on 02/02/2016.
 */
public class XpayToPayDAdapter implements Xpay  {
    private PayD payD;

    public XpayToPayDAdapter() {
        payD = new payDImpl();
    }
        @Override
        public String getCreditCardNo() {
            return payD.getCustCardNo();
        }
        @Override
        public void setCreditCardNo(String creditCardNo) {
            payD.setCustCardNo(creditCardNo);
        }
        @Override
        public String getCustomerName() {
            return payD.getCardOwnerName();
        }
        @Override
        public void setCustomerName(String customerName) {
            payD.setCardOwnerName(customerName);
        }
        @Override
        public String getCardExpMonth() {
            return payD.getCardExpMonthDate();
        }
        @Override
        public void setCardExpMonth(String cardExpMonth) {
            payD.setCardExpMonthDate(cardExpMonth);
        }
        @Override
        public String getCardExpYear() {
            return "cardExpYear is unknown";
        }
        @Override
        public void setCardExpYear(String cardExpYear) {
            //do nothing
        }
        @Override
        public Short getCardCVVNo() {
            return  payD.getCVVNo().shortValue();
            // need to store it as an integer and then return a default value if need be??
        }
        @Override
        public void setCardCVVNo(Short cardCVVNo) {
            payD.setCVVNo((cardCVVNo.intValue());
        }
        @Override
        public Double getAmount() {
            return payD.getTotalAmount();
        }
        @Override
        public void setAmount(Double amount) {
            payD.setTotalAmount(amount);
        }
    }
}
