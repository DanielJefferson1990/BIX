import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankAccount {
    private Long id; // unique user id
    private String username; // user defined nickname for his/her account
    private String firstName;
    private String secondName;
    private String address;
    private String mobilePhone;
    private String email;
    private String phone;
    private List<String> accountNumbers; // debit/credit card or bankbook numbers

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /** 
     * Get full name
     * @return fullname of this user
     */
    public String getFullname() {
        return firstName + " " + secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(List<String> accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    /**
     * Add new account number
     * @param accountNumber new account number
     * @return updated account number list
     */
    public List<String> addAccountNumbers(String accountNumber) {
        if(accountNumbers == null) {
            accountNumbers = new ArrayList<>();
        }
        accountNumbers.add(accountNumber);
        return accountNumbers;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", accountNumbers=" + accountNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(address, that.address) && Objects.equals(mobilePhone, that.mobilePhone) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(accountNumbers, that.accountNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, secondName, address, mobilePhone, email, phone, accountNumbers);
    }
}
