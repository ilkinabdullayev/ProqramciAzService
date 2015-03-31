/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.processing;

import java.util.List;
import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.dao.TaxonomyService;
import org.bakujug.proqramciazservice.enums.TaxonomyType;
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
public class TaxonomyServiceImpl implements TaxonomyService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Taxonomy taxonomy) {
        getCurrentSession().save(taxonomy);
    }

    @Override
    public Taxonomy getTaxonomy(int id) {
        return (Taxonomy)getCurrentSession().get(Taxonomy.class, id);
    }

    @Override
    public List<Taxonomy> getListTaxonomy(TaxonomyType taxonomyType) {
       return getCurrentSession().createCriteria(Taxonomy.class, "from Taxonomy t").list();
    }

    @Override
    public List<Taxonomy> getAllTaxonomy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
