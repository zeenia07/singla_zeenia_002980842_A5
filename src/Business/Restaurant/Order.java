/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.Customer;
import Business.WorkQueue.WorkRequest;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Dell
 */
public class Order extends WorkRequest {
    private static AtomicInteger atomicInteger = new AtomicInteger(101);
    private int orderId;
    private String orderStatus;
    private Restaurant restaurant;
    private Customer customer;
    private String deliveryMan;
    private int quantity;
    private Item item;
    private String result;
    private boolean assign;

    public static AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public static void setAtomicInteger(AtomicInteger atomicInteger) {
        Order.atomicInteger = atomicInteger;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isAssign() {
        return assign;
    }

    public void setAssign(boolean assign) {
        this.assign = assign;
    }
    
     @Override
    public String toString() {
        return String.valueOf(orderId);
    }
}
