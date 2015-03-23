/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myejbapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ulrich
 */
@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.simple",query = "SELECT a from Animal a")
})
public class Animal implements Serializable {
    @OneToMany(mappedBy = "animal")
    private List<Cage> cageList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "animal_id")
    private Integer animalId;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Column(name = "total_no")
    private Integer totalNo;
    @JoinTable(name = "animal_food_item", joinColumns = {
        @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")}, inverseJoinColumns = {
        @JoinColumn(name = "food_item_id", referencedColumnName = "food_item_id")})
    @ManyToMany
    private List<FoodItem> foodItemList;
    @OneToOne(mappedBy = "animal")
    private Cage cage;
    @JoinColumn(name = "category", referencedColumnName = "category_id")
    @ManyToOne
    private Category category;

    public Animal() {
    }

    public Animal(Integer animalId) {
        this.animalId = animalId;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(Integer totalNo) {
        this.totalNo = totalNo;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    
    

    

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (animalId != null ? animalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.animalId == null && other.animalId != null) || (this.animalId != null && !this.animalId.equals(other.animalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myejbapp.entities.Animal[ animalId=" + animalId + " ]";
    }

    public List<Cage> getCageList() {
        return cageList;
    }

    public void setCageList(List<Cage> cageList) {
        this.cageList = cageList;
    }
    
}
