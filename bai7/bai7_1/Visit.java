package bai7.bai7_1;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public String toString(){
        return "Customer: " + customer.getName() + ", Date: " + date + ", Service Expense: " + serviceExpense + ", Product Expense: " + productExpense;
    }
}
