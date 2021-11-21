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
       
    public boolean validateName(JTextField pk){
        String enteredText = pk.getText();
        if(pk.getText().isEmpty()){
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
    
    public boolean validateUserName(JTextField pk){
        String enteredText = pk.getText();
        if(pk.getText().isEmpty()){
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
    
    public boolean validateAddress(JTextField pk){
        return this.validateUserName(pk);
    }
    
    
    public boolean validatePhoneNumber(JTextField phoneTextField){
        // Possible patterns for phone number:
        /* 1234567890, 123-456-7890, 123.456.7890, 
                123 456 7890, (123) 456 7890 */
        /*Rules of Phone number in north America 
        https://www.oreilly.com/library/view/regular-expressions-cookbook/9781449327453/ch04s02.html
        Area codes start with a number 2–9, followed by 0–8, and then any third digit.
        The second group of three digits, known as the central office or exchange code,
        starts with a number 2–9, followed by any two digits.
        The final four digits, known as the station code, have no restrictions.
        */
        //        System.out.println("inside method : " + phoneNumber);
        //        int enteredPhoneNumber = Integer.parseInt(phoneNumber.replace("-", "").
        //                replace(".", "").replace(" ", ""));
        String phoneNumber = phoneTextField.getText();
        String enteredPhoneNumber = (phoneNumber.replace("-", "").
                replace(".", "").replace(" ", "").replace("(", "").replace(")", "").
                replace("+", ""));
        
//        Pattern pattern = Pattern.compile("^[2-9][0-8]\\d[2-9]\\d{6}");
        Pattern pattern = Pattern.compile("^(1?)[2-9][0-8]\\d[2-9]\\d{6}");
        // ^(1?)[2-9][0-8]\d[2-9]\d{6}
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
