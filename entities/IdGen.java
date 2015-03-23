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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ulrich
 */
@Entity
@Table(name = "id_gen")
@NamedQueries({
    @NamedQuery(name = "IdGen.findAll", query = "SELECT i FROM IdGen i")})
public class IdGen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "gen_name")
    private String genName;
    @Column(name = "gen_value")
    private Integer genValue;

    public IdGen() {
    }

    public IdGen(String genName) {
        this.genName = genName;
    }

    public String getGenName() {
        return genName;
    }

    public void setGenName(String genName) {
        this.genName = genName;
    }

    public Integer getGenValue() {
        return genValue;
    }

    public void setGenValue(Integer genValue) {
        this.genValue = genValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genName != null ? genName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IdGen)) {
            return false;
        }
        IdGen other = (IdGen) object;
        if ((this.genName == null && other.genName != null) || (this.genName != null && !this.genName.equals(other.genName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myejbapp.entities.IdGen[ genName=" + genName + " ]";
    }
    
}
