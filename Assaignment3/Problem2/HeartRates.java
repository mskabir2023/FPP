package Assignment3.Problem2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private final float RHR = 70f;
    private final float LB = 0.5f;
    private final float UB = 0.85f;
    private float MHR;
    private float AHR;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int age;


    public HeartRates(String fName, String lName, String DOB) {
        this.firstName = fName;
        this.lastName = lName;
        this.dateOfBirth = DOB;
        this.age = calculatePersonAge();
        this.MHR = calculateMaximumHeartRateRange(age);
        this.AHR = MHR - RHR;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculatePersonAge() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate Birthday = LocalDate.parse(dateOfBirth, dateTimeFormatter);

        LocalDate Today = LocalDate.now();

        return Period.between(Birthday, Today).getYears();
    }

    public float calculateMaximumHeartRateRange(int age) {
        return 220 - age;
    }

    public String calculateTargetHeartRateRange(int age) {
        float LBTHR = (AHR * LB) + RHR;
        float UBTHR = (AHR * UB) + RHR;
        return "The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR;
    }

    @Override
    public String toString() {
        return this.calculateTargetHeartRateRange(age)
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nAge: " + this.age
                + "\nDate of Birth: " + this.dateOfBirth
                + "\nMaximum Heart Rate(MHR): " + MHR;
    }
}
