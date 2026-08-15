package day03;
import java.util.ArrayList;
import java.util.List;

public class Problem05 {
    public static void main(String[] args){
        List<Payment> payments = new ArrayList<>();

        payments.add(new CardPayment());
        payments.add(new KakaoPayment());
        payments.add(new BankPayment());

        for (Payment payment : payments) {
            payment.pay(10000);
        }
    }
}
