import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class App {
    public static void main(String[] args)  {
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc=new Scanner(System.in);
        System.out.println("Entre os dados do contrato:");
        System.out.printf("Numero: ");
        int number=sc.nextInt();
        System.out.printf("Data: ");
        sc.nextLine();
        LocalDate date=LocalDate.parse(sc.next(),fmt);
        System.out.printf("Valor do contrato: ");
        Double value=sc.nextDouble();
        try {
            Contract obj= new Contract(number,date,value);
            
            System.out.printf("Entre com o número de parcelas: ");
            int installmentNumber=sc.nextInt();
            ContractService contractService= new ContractService(new PaypalService());
            contractService.processContract(obj, installmentNumber);    

            for(Installment installment:obj.getInstallments()){

                System.out.println(installment);
            }
           
           
        } catch (Exception e) {
            System.out.printf("Error:%s",e.getMessage());

        }

        
        sc.close();



    }
}
