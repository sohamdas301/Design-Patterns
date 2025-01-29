package Problems.Car_Rental.customers;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private long phoneNo;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public UserBuilder setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
