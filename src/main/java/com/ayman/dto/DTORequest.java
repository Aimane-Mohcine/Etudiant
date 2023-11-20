package com.ayman.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class DTORequest {
	
	String nom;
	String prenom;
	String date_naissence;
	String massar;
	String filiere;
}
