package com.ayman.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ayman.dto.DTORequest;
import com.ayman.dto.DTOResponse;
import com.ayman.entities.Etudiant;

@Component
public class MapImp implements InterfaceMap{

	@Override
	public Etudiant dto2etud(DTORequest req) {
		
		Etudiant e=new Etudiant();
		BeanUtils.copyProperties(req,e);
		
		return e;
	}

	@Override
	public DTOResponse etud2dto(Etudiant rep) {
		
		DTOResponse e=new DTOResponse();
		
		e.setId(rep.getId());
		e.setNom(rep.getNom());
		e.setPrenom(rep.getPrenom());
		e.setFiliere(rep.getFiliere());
		
		return e;
	}

}
