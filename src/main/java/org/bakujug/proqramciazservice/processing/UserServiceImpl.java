/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.processing;

import java.util.List;
import org.bakujug.proqramciazservice.beans.User;
import org.bakujug.proqramciazservice.beans.UserMeta;
import org.bakujug.proqramciazservice.dao.UserService;
import org.bakujug.proqramciazservice.enums.UserRoleType;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ilkin Abdullayev
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        getCurrentSession().merge(user);
    }

    @Override
    public void save(UserMeta userMeta) {
        getCurrentSession().save(userMeta);
    }

    @Override
    public void update(UserMeta userMeta) {
        getCurrentSession().merge(userMeta);
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = (List<User>) getCurrentSession().createQuery("from User u").list();
        return users;
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public User getUser(String nickname) {
        User user = (User) getCurrentSession().get(User.class, nickname);
        return user;
    }

    @Override
    public User getUserByEmail(String email) {
        Query query = getCurrentSession().createQuery("from User u WHERE u.email=:email");
        query.setString(email, email);
        User user = (User) query.uniqueResult();
        return user;
    }

    @Override
    public List<User> getAllUser(boolean active) {
        Query query = getCurrentSession().createQuery("from User u WHERE u.active=:active");
        query.setString("active", new Boolean(active).toString());
        List<User> users = (List<User>) query.uniqueResult();
        return users;
    }

    @Override
    public List<User> getAllUser(UserRoleType roleType) {
        Query query = getCurrentSession().createQuery("from User u WHERE u.active=:active");
        query.setString("roleType",roleType.toString());
        List<User> users = (List<User>) query.uniqueResult();
        return users;
    }

}
