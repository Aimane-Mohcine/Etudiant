package com.ayman.mapper;

import com.ayman.dto.DTORequest;
import com.ayman.dto.DTOResponse;
import com.ayman.entities.Etudiant;

public interface InterfaceMap {
	
	public Etudiant dto2etud(DTORequest req);
	
	public DTOResponse etud2dto(Etudiant rep);

}
