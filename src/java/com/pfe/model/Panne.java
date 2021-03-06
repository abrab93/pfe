package com.pfe.model;
// Generated 19 avr. 2015 15:18:14 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Panne generated by hbm2java
 */
@Entity
@Table(name="panne"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = {@UniqueConstraint(columnNames="idCategorie"), @UniqueConstraint(columnNames="idVehicule")} 
)
public class Panne  implements java.io.Serializable {


     private Integer idPanne;
     private Categorie categorie;
     private Vehicule vehicule;
     private Date datePanne;
     private Date heurePanne;
     private String lieuPanne;
     private String descriptionPanne;

    public Panne() {
    }

    public Panne(Categorie categorie, Vehicule vehicule, Date datePanne, Date heurePanne, String lieuPanne, String descriptionPanne) {
       this.categorie = categorie;
       this.vehicule = vehicule;
       this.datePanne = datePanne;
       this.heurePanne = heurePanne;
       this.lieuPanne = lieuPanne;
       this.descriptionPanne = descriptionPanne;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPanne", unique=true, nullable=false)
    public Integer getIdPanne() {
        return this.idPanne;
    }
    
    public void setIdPanne(Integer idPanne) {
        this.idPanne = idPanne;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCategorie", unique=true, nullable=false)
    public Categorie getCategorie() {
        return this.categorie;
    }
    
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVehicule", unique=true, nullable=false)
    public Vehicule getVehicule() {
        return this.vehicule;
    }
    
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datePanne", nullable=false, length=10)
    public Date getDatePanne() {
        return this.datePanne;
    }
    
    public void setDatePanne(Date datePanne) {
        this.datePanne = datePanne;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="heurePanne", nullable=false, length=8)
    public Date getHeurePanne() {
        return this.heurePanne;
    }
    
    public void setHeurePanne(Date heurePanne) {
        this.heurePanne = heurePanne;
    }

    
    @Column(name="lieuPanne", nullable=false, length=50)
    public String getLieuPanne() {
        return this.lieuPanne;
    }
    
    public void setLieuPanne(String lieuPanne) {
        this.lieuPanne = lieuPanne;
    }

    
    @Column(name="descriptionPanne", nullable=false, length=50)
    public String getDescriptionPanne() {
        return this.descriptionPanne;
    }
    
    public void setDescriptionPanne(String descriptionPanne) {
        this.descriptionPanne = descriptionPanne;
    }




}


