package com.pfe.model;
// Generated 19 avr. 2015 15:18:14 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Alertepneu generated by hbm2java
 */
@Entity
@Table(name="alertepneu"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = @UniqueConstraint(columnNames="idVehicule") 
)
public class Alertepneu  implements java.io.Serializable {


     private Integer idAlertePneu;
     private Vehicule vehicule;
     private String desceription;
     private double kilometrageAlert;

    public Alertepneu() {
    }

    public Alertepneu(Vehicule vehicule, String desceription, double kilometrageAlert) {
       this.vehicule = vehicule;
       this.desceription = desceription;
       this.kilometrageAlert = kilometrageAlert;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idAlertePneu", unique=true, nullable=false)
    public Integer getIdAlertePneu() {
        return this.idAlertePneu;
    }
    
    public void setIdAlertePneu(Integer idAlertePneu) {
        this.idAlertePneu = idAlertePneu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVehicule", unique=true, nullable=false)
    public Vehicule getVehicule() {
        return this.vehicule;
    }
    
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    
    @Column(name="desceription", nullable=false, length=65535)
    public String getDesceription() {
        return this.desceription;
    }
    
    public void setDesceription(String desceription) {
        this.desceription = desceription;
    }

    
    @Column(name="kilometrageAlert", nullable=false, precision=22, scale=0)
    public double getKilometrageAlert() {
        return this.kilometrageAlert;
    }
    
    public void setKilometrageAlert(double kilometrageAlert) {
        this.kilometrageAlert = kilometrageAlert;
    }




}


