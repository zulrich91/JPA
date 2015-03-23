/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myejbapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ulrich
 */
@Entity
@Table(name = "emergency")
@NamedQueries({
    @NamedQuery(name = "Emergency.findAll", query = "SELECT e FROM Emergency e")})
public class Emergency implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emergency_id")
    private Integer emergencyId;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 45)
    @Column(name = "case")
    private String case1;
    @Size(max = 45)
    @Column(name = "progress_so_far")
    private String progressSoFar;

    public Emergency() {
    }

    public Emergency(Integer emergencyId) {
        this.emergencyId = emergencyId;
    }

    public Integer getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(Integer emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    public String getProgressSoFar() {
        return progressSoFar;
    }

    public void setProgressSoFar(String progressSoFar) {
        this.progressSoFar = progressSoFar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emergencyId != null ? emergencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emergency)) {
            return false;
        }
        Emergency other = (Emergency) object;
        if ((this.emergencyId == null && other.emergencyId != null) || (this.emergencyId != null && !this.emergencyId.equals(other.emergencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myejbapp.entities.Emergency[ emergencyId=" + emergencyId + " ]";
    }
    
}
