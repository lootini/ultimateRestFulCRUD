package com.siya7a.ultimateRest.controller;

import com.siya7a.ultimateRest.entity.Compte;
import com.siya7a.ultimateRest.service.ICompteService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CompteSoap {

    @Autowired
    ICompteService iCompteService;


    @WebMethod
    public Compte addCompte(@WebParam(name = "compte") Compte compte) {
        return iCompteService.addCompte(compte);
    }

    @WebMethod
    public Compte updateCompte(@WebParam(name = "code") Long code, @WebParam(name = "compte") Compte compte) {
        compte.setCode(code);
        return iCompteService.updateCompte(code, compte);
    }

    @WebMethod
    public void deleteCompte(@WebParam(name = "code") Long code) {
        iCompteService.deleteCompte(code);
    }

    @WebMethod
    public List<Compte> getComptes() {
        return iCompteService.getComptes();
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code) {
        return iCompteService.getCompte(code);
    }
}
