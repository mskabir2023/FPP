package assignment5.prb4;

public class SalariedEmployee extends Employee{
    private double weeklysalary;

    public double getWeeklysalary() {
        return weeklysalary;
    }

    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }

    public SalariedEmployee(String firstName, String lastName, String sSN, double weeklysalary) {
        super(firstName, lastName, sSN);
        this.weeklysalary = weeklysalary;
    }

    @Override
    public double getPayment() {
        return weeklysalary;
    }
   /* @Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }*/
}
