package com.siya7a.ultimateRest.controller;

import com.siya7a.ultimateRest.entity.Compte;
import com.siya7a.ultimateRest.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CompteController implements ICompteService {

    @Autowired
    ICompteService iCompteService;


    @PostMapping(value = "/comptes")
    @Override
    public Compte addCompte(@RequestBody Compte compte) {
        return iCompteService.addCompte(compte);
    }

    @Override
    @PutMapping(value = "/comptes/{code}")
    public Compte updateCompte(@PathVariable("code") Long code, @RequestBody Compte compte) {
        compte.setCode(code);
        return iCompteService.updateCompte(code, compte);
    }

    @Override
    @DeleteMapping(value = "/comptes/{code}")
    public void deleteCompte(@PathVariable Long code) {
        iCompteService.deleteCompte(code);
    }

    @Override
    @GetMapping(value = "/comptes", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Compte> getComptes() {
        return iCompteService.getComptes();
    }

    @Override
    @GetMapping(value = "/comptes/{code}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Compte getCompte(Long code) {
        return iCompteService.getCompte(code);
    }
}
