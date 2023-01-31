package com.siya7a.ultimateRest.service;

import com.siya7a.ultimateRest.entity.Compte;

import java.util.List;

public interface ICompteService {

    public Compte addCompte(Compte compte);
    public Compte updateCompte(Long code, Compte compte);
    public void deleteCompte(Long code);
    public List<Compte> getComptes();
    public Compte getCompte(Long code);
}
