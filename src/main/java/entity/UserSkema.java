/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Bruger
 */
@Entity
public class UserSkema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String jsonString;
    private String username;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastSaved;

    public UserSkema() {
    }

    public UserSkema(String jsonString, String username, Date lastSaved) {
        this.jsonString = jsonString;
        this.username = username;
        this.lastSaved = lastSaved;
    }

    public UserSkema(int id, String jsonString, String username, Date lastSaved) {
        this.id = id;
        this.jsonString = jsonString;
        this.username = username;
        this.lastSaved = lastSaved;
    }
    
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLastSaved() {
        return lastSaved;
    }

    public void setLastSaved(Date lastSaved) {
        this.lastSaved = lastSaved;
    }

    @Override
    public String toString() {
        return "UserSkema{" + "id=" + id + ", jsonString=" + jsonString + ", username=" + username + ", lastSaved=" + lastSaved + '}';
    }

}
