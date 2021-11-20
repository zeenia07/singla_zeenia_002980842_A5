/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Menu {
    
    private List<Item> itemList;

    public Menu() {
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(String itemName, String itemType, double price, String restName){
        Item addItem = new Item(itemName,itemType, price, restName);
        itemList.add(addItem);
    }
    
     public void deleteItem(Item item) {
        itemList.remove(item);
    }
    
}
