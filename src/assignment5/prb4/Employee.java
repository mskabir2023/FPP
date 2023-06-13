package assignment5.prb4;

import java.util.Objects;

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

    public Employee(String afirstName, String alastName, String asSN) {
        firstName = afirstName;
        lastName = alastName;
        sSN = asSN;
    }

    @Override
    public String toString() {
        return "Name: "+ getFirstName()+" "+getLastName()+" "+"Salary: "+ getPayment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(sSN, employee.sSN);

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sSN);
    }
}
