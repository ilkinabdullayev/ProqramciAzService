/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.bakujug.proqramciazservice.enums.UserRoleType;

/**
 *
 * @author Ilkin Abdullayev
 */
@Table(name = "paz.PAZ_USER_META")
@Entity
public class UserMeta implements Serializable {

    @Id
    @Column(name = "NICKNAME")
    private User user;

    @Column(name = "FIRSTNAME", length = 100)
    private String firstname;

    @Column(name = "LASTNAME", length = 100)
    private String lastname;

    @Column(name = "DISPLAY_NAME", length = 100)
    private String displayname;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "URL", length = 100)
    private String url;

    public UserMeta() {
    }

    public UserMeta(User user) {
        this.user = user;
    }   
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.user != null ? this.user.hashCode() : 0);
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
        final UserMeta other = (UserMeta) obj;
        if (this.user != other.user && (this.user == null || !this.user.equals(other.user))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserMeta{" + "user=" + user + '}';
    }

}
