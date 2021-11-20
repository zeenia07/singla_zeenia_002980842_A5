/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DB4OUtil.DB4OUtil;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;

     public RestaurantDirectory() {
        restaurantList = DB4OUtil.getInstance().retrieveSystem().getRestaurantDirectory().getRestaurantList();
    }
     
    public ArrayList<Restaurant> returnAllRestaurants() {
        return restaurantList;
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant addRestaurant(String name, String address, String managerName, long phoneNumber) {
        Restaurant restaurant = new Restaurant(name, address, managerName, phoneNumber);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void deleteRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }
    
    public Restaurant getRestaurant(String name) {
        for(Restaurant res : restaurantList) {
            if(res.getName().equals(name)) {
                return res;
            }
        }
        return null;
    }
    
     public Restaurant getRestaurant(UserAccount ua){
        for(Restaurant r : restaurantList) {
            if(r.returnUserAccount().getUsername().equals(ua.getUsername())) {
                return r;
            }
        }
        return null;
    }
    
    public void addRestaurant(Restaurant res){
        restaurantList.add(res);
    }
    
    
}
