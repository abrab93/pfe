package com.pfe.model;
// Generated 19 avr. 2015 15:18:14 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="utilisateur"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = @UniqueConstraint(columnNames="idService") 
)
public class Utilisateur  implements java.io.Serializable {


     private Integer idUtilisateur;
     private Service service;
     private String nomUtilisateur;
     private String passWord;
     private String email;
     private String nomPrenom;
     private boolean blocked;
     private Set<Transaction> transactions = new HashSet<Transaction>(0);

    public Utilisateur() {
    }

	
    public Utilisateur(Service service, String nomUtilisateur, String passWord, String email, String nomPrenom, boolean blocked) {
        this.service = service;
        this.nomUtilisateur = nomUtilisateur;
        this.passWord = passWord;
        this.email = email;
        this.nomPrenom = nomPrenom;
        this.blocked = blocked;
    }
    public Utilisateur(Service service, String nomUtilisateur, String passWord, String email, String nomPrenom, boolean blocked, Set<Transaction> transactions) {
       this.service = service;
       this.nomUtilisateur = nomUtilisateur;
       this.passWord = passWord;
       this.email = email;
       this.nomPrenom = nomPrenom;
       this.blocked = blocked;
       this.transactions = transactions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idUtilisateur", unique=true, nullable=false)
    public Integer getIdUtilisateur() {
        return this.idUtilisateur;
    }
    
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idService", unique=true, nullable=false)
    public Service getService() {
        return this.service;
    }
    
    public void setService(Service service) {
        this.service = service;
    }

    
    @Column(name="nomUtilisateur", nullable=false, length=20)
    public String getNomUtilisateur() {
        return this.nomUtilisateur;
    }
    
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    
    @Column(name="passWord", nullable=false, length=20)
    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    @Column(name="email", nullable=false, length=20)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="nomPrenom", nullable=false, length=20)
    public String getNomPrenom() {
        return this.nomPrenom;
    }
    
    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    
    @Column(name="blocked", nullable=false)
    public boolean isBlocked() {
        return this.blocked;
    }
    
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public Set<Transaction> getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }




}

