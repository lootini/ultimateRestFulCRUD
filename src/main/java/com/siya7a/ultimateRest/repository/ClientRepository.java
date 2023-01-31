package com.siya7a.ultimateRest.repository;

import com.siya7a.ultimateRest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
