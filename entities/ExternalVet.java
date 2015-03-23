/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myejbapp.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author ulrich
 */
@Entity
@Table(name = "external_vet")
@DiscriminatorValue("EXT_VET")
public class ExternalVet extends Vet{
    private String country;
    @Column(name = "visiting_fee")
    private Integer visitingFee;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getVisitingFee() {
        return visitingFee;
    }

    public void setVisitingFee(Integer visitingFee) {
        this.visitingFee = visitingFee;
    }
    
}
