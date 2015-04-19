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
 * Vidange generated by hbm2java
 */
@Entity
@Table(name="vidange"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = @UniqueConstraint(columnNames="idVehicule") 
)
public class Vidange  implements java.io.Serializable {


     private Integer idVidange;
     private Vehicule vehicule;
     private Date dateVidange;
     private int nombreLitres;
     private double kilometrage;
     private String typeVehicule;

    public Vidange() {
    }

    public Vidange(Vehicule vehicule, Date dateVidange, int nombreLitres, double kilometrage, String typeVehicule) {
       this.vehicule = vehicule;
       this.dateVidange = dateVidange;
       this.nombreLitres = nombreLitres;
       this.kilometrage = kilometrage;
       this.typeVehicule = typeVehicule;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idVidange", unique=true, nullable=false)
    public Integer getIdVidange() {
        return this.idVidange;
    }
    
    public void setIdVidange(Integer idVidange) {
        this.idVidange = idVidange;
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
    @Column(name="dateVidange", nullable=false, length=10)
    public Date getDateVidange() {
        return this.dateVidange;
    }
    
    public void setDateVidange(Date dateVidange) {
        this.dateVidange = dateVidange;
    }

    
    @Column(name="nombreLitres", nullable=false)
    public int getNombreLitres() {
        return this.nombreLitres;
    }
    
    public void setNombreLitres(int nombreLitres) {
        this.nombreLitres = nombreLitres;
    }

    
    @Column(name="kilometrage", nullable=false, precision=22, scale=0)
    public double getKilometrage() {
        return this.kilometrage;
    }
    
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    
    @Column(name="typeVehicule", nullable=false, length=40)
    public String getTypeVehicule() {
        return this.typeVehicule;
    }
    
    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }




}


