package com.ayman.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nom;
	String prenom;
	String date_naissence;
	String massar;
	String filiere;
	

	

}