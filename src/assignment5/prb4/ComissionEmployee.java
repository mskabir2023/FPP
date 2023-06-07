package assignment5.prb4;

public class ComissionEmployee extends  Employee{
    private double grossSales;
    private  double commissionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public ComissionEmployee(String firstName, String lastName, String sSN, double grossSales, double commissionRate) {
        super(firstName, lastName, sSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    @Override
    public double getPayment() {
        return grossSales*commissionRate;
    }
    /*@Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }*/
}
