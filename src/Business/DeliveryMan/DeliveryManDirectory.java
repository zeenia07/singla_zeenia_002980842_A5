/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
     ArrayList<DeliveryMan> deliveryList;
    
    public DeliveryManDirectory(){
        deliveryList = new ArrayList<DeliveryMan>();
    }
    
    public void addDeliveryMan(DeliveryMan dm){
        deliveryList.add(dm);
    }
    
    public void deleteDeliveryMan(DeliveryMan dm){
        deliveryList.remove(dm);
    }
    
    public ArrayList<DeliveryMan> deliveryAgentDetails(){
        return deliveryList;
    }
    
}
