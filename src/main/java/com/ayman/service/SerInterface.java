package com.ayman.service;

import java.util.List;

import com.ayman.dto.DTORequest;
import com.ayman.dto.DTOResponse;

public interface SerInterface {
	
	public void add(DTORequest req);
	
	public List<DTOResponse> ListEtudiant();
	
	public DTOResponse EtudiantById(Integer id);
	
	public void update(Integer id, DTORequest req);
	
	public void supprimer(Integer id);

}
