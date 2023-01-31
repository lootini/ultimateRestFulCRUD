package com.siya7a.ultimateRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.util.Collection;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 25)
    String nom;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @JsonIgnore
    @XmlTransient
    Collection<Compte> comptes;

    public Client() {
    }

    public Client(Long id, String nom, Collection<Compte> comptes) {
        this.id = id;
        this.nom = nom;
        this.comptes = comptes;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
}
