/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.processing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.dao.TaxonomyService;
import org.bakujug.proqramciazservice.enums.TaxonomyType;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Component
@Transactional
public class TaxonomyServiceImpl implements TaxonomyService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Taxonomy taxonomy) {
        getCurrentSession().save(taxonomy);
    }

    @Override
    public Taxonomy getTaxonomy(int id) {
        Taxonomy taxonomy = (Taxonomy) getCurrentSession().get(Taxonomy.class, id);
        taxonomyInitialize(taxonomy);
        return taxonomy;
    }

    @Override
    public List<Taxonomy> getListTaxonomy(TaxonomyType taxonomyType) {
        return getCurrentSession().createQuery("from Taxonomy t").list();
    }

    @Override
    public List<Taxonomy> getAllTaxonomy() {
        List<Taxonomy> taxonomys = (List<Taxonomy>) getCurrentSession().createQuery("from Taxonomy t").list();
        taxonomyListInitialize(taxonomys);
        return taxonomys;
    }

    private void taxonomyListInitialize(List<Taxonomy> taxonomies) {       
            for (Taxonomy tax : taxonomies) {
                Hibernate.initialize(tax.getPosts());
            }       
    }
    
    private void taxonomyInitialize(Taxonomy taxonomy) {       
            Hibernate.initialize(taxonomy.getPosts());       
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
