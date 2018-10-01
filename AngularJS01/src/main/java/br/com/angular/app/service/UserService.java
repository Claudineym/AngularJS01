/**
 * 
 */
package br.com.angular.app.service;

import java.util.List;

import br.com.angular.app.model.User;

/**
 * @author claudiney.viana
 *
 */
public interface UserService {
	
	User findById(long id);
    
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    List<User> findAllUsers(); 
     
    void deleteAllUsers();
     
    public boolean isUserExist(User user);

}
