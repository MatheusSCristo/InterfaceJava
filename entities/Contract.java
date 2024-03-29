package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    protected LocalDate date;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

}
