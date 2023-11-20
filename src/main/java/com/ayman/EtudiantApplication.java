package com.ayman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ayman.Repository.EtudiantRepository;
import com.ayman.entities.Etudiant;



@SpringBootApplication
public class EtudiantApplication   implements CommandLineRunner{
	
	@Autowired
	EtudiantRepository p1;

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Etudiant e1=new Etudiant(null,"Mohcine","aimane","22/05/2001","D130786959","IAO");
		Etudiant e2=new Etudiant(null,"boukhris","bard","02/05/2002","D1346346275","IAO");
		Etudiant e3=new Etudiant(null,"hmichat","hicham","16/09/2001","C325231142","DS");
		Etudiant e4=new Etudiant(null,"Fawar","mohmed","12/01/2000","F31423253253","AI");
		Etudiant e5=new Etudiant(null,"Lamdibih","samir","23/05/2001","D145624523","WISD");




		
		p1.save(e1);
		p1.save(e2);
		p1.save(e3);
		p1.save(e4);
		p1.save(e5);
	}

}
