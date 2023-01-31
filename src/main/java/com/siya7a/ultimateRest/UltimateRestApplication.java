package com.siya7a.ultimateRest;

import com.siya7a.ultimateRest.entity.Client;
import com.siya7a.ultimateRest.entity.Compte;
import com.siya7a.ultimateRest.repository.ClientRepository;
import com.siya7a.ultimateRest.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class UltimateRestApplication implements CommandLineRunner {

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	CompteRepository compteRepository;

	public static void main(String[] args) {
		SpringApplication.run(UltimateRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		clientRepository.save(new Client(null, "Hatika", null));
		clientRepository.save(new Client(null, "Apchakh", null));

		compteRepository.save(new Compte(null, 6500, new Date(), new Client(1L, null, null)));
		compteRepository.save(new Compte(null, 25876, new Date(), new Client(1L, null, null)));

		compteRepository.save(new Compte(null, 9888, new Date(), new Client(2L, null, null)));
		compteRepository.save(new Compte(null, 12500, new Date(), new Client(2L, null, null)));

	}
}
