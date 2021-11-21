package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");   
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee customer = system.getEmployeeDirectory().createEmployee("Customer");
        UserAccount customerAccount = system.getUserAccountDirectory().createUserAccount("customer01", "customer01", customer, new CustomerRole());
        Customer cus = new Customer(customerAccount);
        cus.setAddress("JVUE apartments");
        cus.setPhoneNumber(1234567890L);
        system.getCustomerDirectory().addCustomer(cus);
        
        Employee delivery = system.getEmployeeDirectory().createEmployee("Delivery");
        UserAccount deliveryAccount = system.getUserAccountDirectory().createUserAccount("delivery01", "delivery01", delivery, new DeliverManRole());
        DeliveryMan deliveryAgent = new DeliveryMan(deliveryAccount);
        deliveryAgent.setAddress("Mission Hill");
        deliveryAgent.setPhoneNumber(9876543210L);
        deliveryAgent.setStatus("Available");
        system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
        
        
        Employee delivery1 = system.getEmployeeDirectory().createEmployee("Delivery");
        UserAccount deliveryAccount1 = system.getUserAccountDirectory().createUserAccount("delivery02", "delivery02", delivery1, new DeliverManRole());
        DeliveryMan deliveryAgent1 = new DeliveryMan(deliveryAccount);
        deliveryAgent.setAddress("Mission Main");
        deliveryAgent.setPhoneNumber(9876543211L);
        deliveryAgent.setStatus("Not Available");
        system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
        
        Employee restaurant = system.getEmployeeDirectory().createEmployee("Restaurant");
        UserAccount restaurantAccount = system.getUserAccountDirectory().createUserAccount("qdoba", "qdoba", restaurant, new AdminRole());
        
        Restaurant restaurantData = new Restaurant("Qdoba Mexican Grill", "NEU","Tristin",
                                  9776655443L, restaurantAccount);
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Burrito", "Vegetarian", 9.90, "Qdoba Mexican Grill"));
        itemList.add(new Item("Quesadilla", "Vegetarian", 10.75, "Qdoba Mexican Grill"));
        Menu menuItems = new Menu();
        menuItems.setMenu(itemList);
        restaurantData.setMenu(menuItems);
        system.getRestaurantDirectory().addRestaurant(restaurantData);
        
        Employee restaurant1 = system.getEmployeeDirectory().createEmployee("Restaurant");
        UserAccount restaurantAccount1 = system.getUserAccountDirectory().createUserAccount("dominos", "dominos", restaurant1, new AdminRole());
        
        Restaurant restaurantData1 = new Restaurant("Dominos", "Prudential","Harry",
                                  9776655442L, restaurantAccount);
        ArrayList<Item> itemList1 = new ArrayList<Item>();
        itemList.add(new Item("Farmhouse Pizza","Vegetarian", 7.75, "Qdoba Mexican Grill"));
        itemList.add(new Item("BBQ Chicken Pizza","Non-Vegetarian", 10.75, "Qdoba Mexican Grill"));
        Menu menuItems1 = new Menu();
        menuItems.setMenu(itemList1);
        restaurantData1.setMenu(menuItems1);
        system.getRestaurantDirectory().addRestaurant(restaurantData1);
        
        return system;
    }
    
}
