/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bakujug.proqramciazservice.dao;

import java.util.List;
import org.bakujug.proqramciazservice.beans.Taxonomy;
import org.bakujug.proqramciazservice.enums.TaxonomyType;

/**
 *
 * @author Administrator
 */
public interface TaxonomyService {
    public Taxonomy getTaxonomy(int id);
    public List<Taxonomy> getListTaxonomy(TaxonomyType taxonomyType);
    public List<Taxonomy> getAllTaxonomy();
    public void save(Taxonomy taxonomy);
}
