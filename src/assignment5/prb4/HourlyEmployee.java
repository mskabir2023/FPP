package assignment5.prb4;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyEmployee(String firstName, String lastName, String sSN, double wage, double hours) {
        super(firstName, lastName, sSN);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage*hours;
    }

   /* @Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }*/
}
