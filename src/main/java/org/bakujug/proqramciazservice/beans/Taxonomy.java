/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.bakujug.proqramciazservice.enums.TaxonomyType;

/**
 *
 * @author Ilkin Abdullayev
 */
@Table(name = "paz.PAZ_TAXONOMY")
@Entity
public class Taxonomy implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "TAX_NAME", nullable = false, length = 200)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "TAXONOMY_TYPE", nullable = false, length = 20)
    private TaxonomyType taxonomyType;

    public Taxonomy() {
    }

    public Taxonomy(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaxonomyType getTaxonomyType() {
        return taxonomyType;
    }

    public void setTaxonomyType(TaxonomyType taxonomyType) {
        this.taxonomyType = taxonomyType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Taxonomy other = (Taxonomy) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Taxonomy{" + "id=" + id + ", name=" + name + ", taxonomyType=" + taxonomyType + '}';
    }    
    
}
