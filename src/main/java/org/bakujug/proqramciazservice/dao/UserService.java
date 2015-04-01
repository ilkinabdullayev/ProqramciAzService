/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.dao;

import java.util.List;
import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.beans.User;
import org.bakujug.proqramciazservice.beans.UserMeta;
import org.bakujug.proqramciazservice.enums.UserRoleType;

/**
 *
 * @author Administrator
 */
public interface UserService {

    public void save(User user);
    public void update(User user);
    public void save(UserMeta userMeta);
    public void update(UserMeta userMeta);    
    public List<User> getAllUser();
    public List<User> getAllUser(boolean active);
    public List<User> getAllUser(UserRoleType roleType);
    public User getUser(String nickname);
    public User getUserByEmail(String email);
}
