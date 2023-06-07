package assignment5.prb4;

public class BasePlusCommissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, sSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public double getPayment(){
        return baseSalary+super.getPayment();
    }
   /* @Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }*/

}
