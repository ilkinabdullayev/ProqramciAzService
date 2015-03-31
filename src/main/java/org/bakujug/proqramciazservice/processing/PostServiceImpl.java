/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.processing;

import org.bakujug.proqramciazservice.beans.Post;
import org.bakujug.proqramciazservice.dao.PostService;
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
public class PostServiceImpl implements PostService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override   
    public void save(Post post) {
       getCurrentSession().save(post);
    }   

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
