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
    private long mobileNO;
    private String address;
    private String userName;
    private String password;
    UserAccount user;
    
    public Customer(UserAccount user) {
        this.user=user;
        this.name = name;
        this.mobileNO = mobileNO;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(long mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public UserAccount returnUserAccount(){
        return this.user;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
