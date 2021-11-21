/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Dell
 */
public class Item {
    
    private String itemName;
    private String itemType;
    private double price;
    private String restaurantName;
    
    public Item(String itemName, String itemType, double price, String restaurantName) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    

    
}
