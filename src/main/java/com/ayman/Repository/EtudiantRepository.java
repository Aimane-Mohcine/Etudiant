package com.ayman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayman.entities.Etudiant;



 
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}