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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Size;

/**
 *
 * @author ulrich
 */
@Entity
@Table(name = "cage")
@NamedQueries({
    @NamedQuery(name = "Cage.findAll", query = "SELECT c FROM Cage c")})
public class Cage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cage_id")
    private Integer cageId;
    @Size(max = 45)
    @Column(name = "cage_no")
    private String cageNo;
    @Size(max = 45)
    @Column(name = "location")
    private String location;
    @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")
    @OneToOne
    private Animal animal;
    
    @Version
    private int version;

    public Cage() {
    }

    public Cage(Integer cageId) {
        this.cageId = cageId;
    }

    public Integer getCageId() {
        return cageId;
    }

    public void setCageId(Integer cageId) {
        this.cageId = cageId;
    }

    public String getCageNo() {
        return cageNo;
    }

    public void setCageNo(String cageNo) {
        this.cageNo = cageNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cageId != null ? cageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cage)) {
            return false;
        }
        Cage other = (Cage) object;
        if ((this.cageId == null && other.cageId != null) || (this.cageId != null && !this.cageId.equals(other.cageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myejbapp.entities.Cage[ cageId=" + cageId + " ]";
    }
    
}
