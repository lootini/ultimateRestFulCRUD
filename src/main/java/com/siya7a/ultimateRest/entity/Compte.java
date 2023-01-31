package com.siya7a.ultimateRest.entity;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long code;

    double solde;
    @Temporal(TemporalType.DATE)
    Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "id_CLient")
    Client client;

    public Compte() {
    }

    public Compte(Long code, double solde, Date dateCreation, Client client) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.client = client;
    }

    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
