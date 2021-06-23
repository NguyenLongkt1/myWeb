package javabean;

public class User {
    private int userID;
    private String account;
    private String password;
    private String name;
    private String email;
    private String phoneNumbers;
    private String address;
    
    public User(){}
    public User(String account){
        this.account = account;
    }
    public User(int userID, String account, String password, String name, String email, String phoneNumbers, String address) {
        this.userID = userID;
        this.account = account;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", account=" + account + ", password=" + password + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + ", address=" + address + '}';
    }
    
    

    
    
    
}
