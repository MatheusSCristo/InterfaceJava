package services;


import entities.Contract;
import entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService =onlinePaymentService;
    }


    public void  processContract(Contract contract, int months) {
        for(int i=1;i<=months;i++){
            double interest=onlinePaymentService.interest(contract.getTotalValue()/3, i);
            double totalValue=onlinePaymentService.paymentFee(interest);
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i),totalValue));
        }
    }

}
