/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Order;
import Business.Restaurant.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public OrderDirectory getOrderDirectory(){
        return this.orderDirectory;
    }
    
    public EcoSystem(){
        super("Restaurant Delivery");
        this.customerDirectory = new CustomerDirectory();
        this.restaurantDirectory = new RestaurantDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.orderDirectory = new OrderDirectory();
    }

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,
            OrderDirectory orderDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory=orderDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
//    private EcoSystem(){
//        super(null);
//       // networkList=new ArrayList<Network>();
//    }
    

    
    public boolean checkIfUserIsUnique(String userName){
       //
       if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
       }
       return true;
       //return false;
    }
    
    public int getLastOrderId(){
        int maxOrderId = 0;
        for(Order o : this.orderDirectory.getOrderList()){
            if(o.getOrderId() > maxOrderId){
               maxOrderId = o.getOrderId();
            }
        }
        return maxOrderId;
    }
}
