package com.ayman.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayman.Repository.EtudiantRepository;

import com.ayman.dto.DTORequest;
import com.ayman.dto.DTOResponse;
import com.ayman.service.SerInterface;

@RestController
@RequestMapping("/api")

public class ControllerRest {

	
	@Autowired
	EtudiantRepository p1;
	@Autowired
	SerInterface s;
	
	@GetMapping("/etudiants")
	
public List<DTOResponse> getAll(){
		
		return s.ListEtudiant();
		
	}
	
	@GetMapping("/etudiants/{id}")
	public DTOResponse getById( @PathVariable ("id")   Integer id){
		
		return  s.EtudiantById(id);
		
	}
	
	@PostMapping("/etudiants")
	public void save(@RequestBody			DTORequest  req){
		
		s.add(req);
		
	}
	
	@PutMapping("/etudiants/{id}")
	public void save( @PathVariable("id")  Integer id,     @RequestBody	DTORequest c){
		
		s.update(id, c);
		
	}
	
	@DeleteMapping("/etudiants/{id}")
	
	public void supprimer(@PathVariable Integer id) {
		
	s.supprimer(id);
	}
	
	
	
}
