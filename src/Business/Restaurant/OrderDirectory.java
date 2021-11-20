/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class OrderDirectory {
     private ArrayList<Order> orderList;
     
    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public OrderDirectory(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
     
     public Order addOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public Order getOrderId(int orderId){
        for(Order order: orderList){
            if(order.getOrderId()== (orderId)){
                return order;
            }
        }
        return null;
    }
}
