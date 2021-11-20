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
    ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<Customer>();
    }
    
    public void addCustomer(Customer c){
        customerList.add(c);
    }
    
    public void deleteCustomer(Customer c){
        customerList.remove(c);
    }
    
    public ArrayList<Customer> customerDetails(){
        return customerList;
    }
    
    public Customer getCustomer(String name){
        for(Customer customer: customerList){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    
    public void setCustomerDetails(ArrayList<Customer> cusList){
        customerList = cusList;
    }
    

}
