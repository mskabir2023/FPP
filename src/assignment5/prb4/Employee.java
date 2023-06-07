package assignment5.prb4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String sSN;
    public abstract double getPayment();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public Employee(String firstName, String lastName, String sSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sSN = sSN;
    }

    @Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }
}
