package com.ayman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ayman.Repository.EtudiantRepository;
import com.ayman.dto.DTORequest;
import com.ayman.dto.DTOResponse;
import  com.ayman.mapper.InterfaceMap;
import com.ayman.entities.Etudiant;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class SerImp implements SerInterface{
	
	
	@Autowired
	EtudiantRepository p1;
	@Autowired
	InterfaceMap m;

	@Override
	public void add(DTORequest req) {
		
		Etudiant e=m.dto2etud(req);
		p1.save(e);
		
	}

	@Override
	public List<DTOResponse> ListEtudiant() {
		
		List <Etudiant> le=new ArrayList<>();
		List <DTOResponse> l=new ArrayList<>();
		
		le=p1.findAll();
		for(Etudiant e:le) {
			DTOResponse r=new DTOResponse();
			r=m.etud2dto(e);
			l.add(r);
		}
	
		return l;
	}

	@Override
	public DTOResponse EtudiantById(Integer id) {
		
		Etudiant e=p1.findById(id).get();
		
		DTOResponse rep=m.etud2dto(e);
		
		
	
		return rep;
	}

	@Override
	public void update(Integer id,DTORequest req) {
		
		Etudiant e=p1.findById(id).get();
		
		if(req.getNom()!=null) {
			e.setNom(req.getNom());
			
		}
		if(req.getPrenom()!=null) {
			e.setPrenom(req.getPrenom());
		}
		if(req.getDate_naissence()!=null) {
			e.setDate_naissence(req.getDate_naissence());
		}
		if(req.getMassar()!=null) {
			e.setMassar(req.getMassar());
		}
		
		if(req.getFiliere()!=null) {
			e.setFiliere(req.getFiliere());
		}
		
		p1.save(e);
		
	}

	@Override
	public void supprimer(Integer id) {
		
		p1.deleteById(id);
	}

}
