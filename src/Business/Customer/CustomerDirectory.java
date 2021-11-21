/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    ArrayList<Customer> cust;
    
    public CustomerDirectory(){
       cust = new ArrayList<Customer>();
    }
    
    public void addCustomer(Customer c){
        cust.add(c);
    }
    
    public void deleteCustomer(Customer c){
        cust.remove(c);
    }
    
    public ArrayList<Customer> returnCustomerDetails(){
        return cust;
    }
    
    public Customer getCustomer(String name){
        for(Customer customer: cust){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    
    public void setCustomerDetails(ArrayList<Customer> cusList){
        cust= cusList;
    }
    
}
