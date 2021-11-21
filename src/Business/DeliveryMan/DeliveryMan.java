/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String status;
    private String address;
    private long phoneNumber;
    UserAccount userAccount;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUa(UserAccount ua) {
        this.userAccount = userAccount;
    }
    
    public DeliveryMan(UserAccount ua)
    {
        this.userAccount= userAccount;
        this.name = ua.getUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

      
    @Override
    public String toString(){
        return name;
    }
    
  
}
