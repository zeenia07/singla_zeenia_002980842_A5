/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private int restId;
    private String name;
    private String address;
    private long phone;
    private Menu menu;
    private String managerName;
     private UserAccount restManager;
     
     public Restaurant(String restaurantName, String address,
                String managerName, long phoneNumber, UserAccount user) {
        this.name = restaurantName;
        this.address = address;
        this.managerName = managerName;
        this.phone = phoneNumber;
        this.restManager = user;
    }

     public Restaurant(String name, String address, String managerName, long phoneNumber) {
        //To change body of generated methods, choose Tools | Templates.
        this.name = name;
        this.address = address;
        this.managerName = managerName;
        this.phone = phoneNumber;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
     public UserAccount returnUserAccount(){
        return this.restManager;
    }
    
     @Override
    public String toString() {
        return name;
    }
    
}
