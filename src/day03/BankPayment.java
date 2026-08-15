package day03;

public class BankPayment implements Payment{

    @Override
    public void pay(int amount){
        System.out.println("계좌이체로 "+amount+"원 결제");
    }
}
