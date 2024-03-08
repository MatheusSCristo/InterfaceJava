package services;

public class PaypalService implements OnlinePaymentService{

    public PaypalService(){
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount + amount * 0.01 * months;
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount*1.02 ;
    }
    

}
