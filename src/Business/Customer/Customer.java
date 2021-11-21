/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer {
    
    private String name;
    private String userName;
    private String userPassword;
    private long phoneNumber;
    private String address;
    UserAccount userAccount;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUa() {
        return userAccount;
    }

    public void setUa(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public Customer(UserAccount userAccount){
       this.userAccount = userAccount; 
       this.name = userAccount.getEmployee().getName();
       this.userName = userAccount.getUsername();
       this.userPassword = userAccount.getPassword();
    }
    
    public UserAccount returnUserAccount(){
        return this.userAccount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
