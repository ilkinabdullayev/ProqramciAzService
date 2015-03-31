/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.bakujug.proqramciazservice.enums.UserRoleType;

/**
 *
 * @author Ilkin Abdullayev
 */
@Table(name = "paz.PAZ_USER")
@Entity
public class User implements Serializable {

    @Id
    @Column(name = "NICKNAME",length = 60)
    private String nickname;

    @Column(name = "PASSWORD", nullable = false, length = 64)
    private String password;

    @Column(name = "EMAIL", nullable = false, unique = false, length = 100)
    private String email;    

    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTRATION_DATE",nullable = false)
    private Date registrationDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DEREGISTRATION_DATE")
    private Date deRegistrationDate;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "USER_STATUS",nullable = false,length = 20)
    private UserRoleType userStatus;
    
    @Column(name = "ACTIVE",nullable = false)
    private boolean active;

    public User() {
    }   

    public User(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getDeRegistrationDate() {
        return deRegistrationDate;
    }

    public void setDeRegistrationDate(Date deRegistrationDate) {
        this.deRegistrationDate = deRegistrationDate;
    }

    public UserRoleType getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserRoleType userStatus) {
        this.userStatus = userStatus;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.nickname != null ? this.nickname.hashCode() : 0);
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
        final User other = (User) obj;
        if ((this.nickname == null) ? (other.nickname != null) : !this.nickname.equals(other.nickname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "nickname=" + nickname + ", userStatus=" + userStatus + ", active=" + active + '}';
    }
 
}
