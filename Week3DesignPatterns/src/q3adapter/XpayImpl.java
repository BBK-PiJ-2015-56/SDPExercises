package q3adapter;

/**
 * Created by peted on 02/02/2016.
 */
public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    private XpayToPayDAdapter;

    public XPayImpl(){
        // not sure what to put here to channel it to adapter only
        // when necc.
    }
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public String getCustomerName() {
        return customerName;
    }
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }
    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }
    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }
    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }
    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }
    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}