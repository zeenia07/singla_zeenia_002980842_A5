/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Validation {
       
    public boolean validateName(JTextField vn){
        String enteredText = vn.getText();
        if(vn.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[A-Za-z\\s-.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    }
    
    public boolean validateUserName(JTextField vun){
        String enteredText = vun.getText();
        if(vun.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[A-Z0-9a-z\\s-.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    }
    
    public boolean validateAddress(JTextField va){
        return this.validateUserName(va);
    }
    
    
    public boolean validatePhoneNumber(JTextField phoneTextField){
       
        String phoneNumber = phoneTextField.getText();
        String enteredPhoneNumber = (phoneNumber.replace("-", "").
                replace(".", "").replace(" ", "").replace("(", "").replace(")", "").
                replace("+", ""));
       
        Pattern pattern = Pattern.compile("^(1?)[2-9][0-8]\\d[2-9]\\d{6}");
        
        Matcher matcher = pattern.matcher(enteredPhoneNumber);

        if(matcher.matches()){
            if(enteredPhoneNumber.startsWith("1") && enteredPhoneNumber.length()==11){
                return true;
            }
            else if(enteredPhoneNumber.length() == 10){
                return true;
            }
        }
        return false;
    }
        
}
