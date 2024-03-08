package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate date;
    private Double amount;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate getdate() {
        return date;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt) +  " - " + String.format("%.2f",amount); 
    }

}
