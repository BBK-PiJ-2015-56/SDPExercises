package q3adapter;

/**
 * Created by peted on 02/02/2016.
 */
public interface Xpay {
    String getCreditCardNo();
    void setCreditCardNo(String creditCardNo);

    String getCustomerName();
    void setCustomerName(String customerName);

    String getCardExpMonth();
    void setCardExpMonth(String cardExpMonth);

    String getCardExpYear();
    void setCardExpYear(String cardExpYear);

    Short getCardCVVNo();
    void setCardCVVNo(Short cardCVVNo);

    Double getAmount();
    void setAmount(Double amount);
}
