/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;
    DB4OUtil dB4OUtil=DB4OUtil.getInstance();

    public UserAccountDirectory() {
        userAccountList = dB4OUtil.retrieveSystem().getUserAccountDirectory().getUserAccountList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        if (userAccountList == null) {
            return new ArrayList<>();
        }
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount user : userAccountList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
 
   }
    
     public UserAccount getUserAccount(String username){
        for (UserAccount user : userAccountList){
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }
    
    public void deleteUserAccount(UserAccount inputUser){
        Iterator<UserAccount> i = userAccountList.iterator();
        while (i.hasNext()) {
            UserAccount user = i.next();
            if (user.getUsername().equals(inputUser.getUsername())) {
                i.remove();
            }
        }
    }
}
