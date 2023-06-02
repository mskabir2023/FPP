package Assignment3.Problem1;
public class Customer {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String fName, String lName, String sSNum) {
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = sSNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public String getSocSecurityNum() {
        return socialSecurityNumber;
    }

    public void setSocSecurityNumber(String sSNum) {
        this.socialSecurityNumber = sSNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socialSecurityNumber + "]";
    }
}
