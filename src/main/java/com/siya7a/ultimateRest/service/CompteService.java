package com.siya7a.ultimateRest.service;

import com.siya7a.ultimateRest.entity.Compte;
import com.siya7a.ultimateRest.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompteService implements ICompteService{

    @Autowired
    CompteRepository compteRepository;
    @Override
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Long code, Compte compte) {
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @Override
    public void deleteCompte(Long code) {
        compteRepository.deleteById(code);
    }

    @Override
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }

    @Override
    public Compte getCompte(Long code) {
        return compteRepository.findById(code).get();
    }
}
