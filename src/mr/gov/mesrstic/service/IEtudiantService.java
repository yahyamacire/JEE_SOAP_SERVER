package mr.gov.mesrstic.service;

import java.util.List;

import mr.gov.mesrstic.model.Etudiant;


public interface IEtudiantService {

	void save(Etudiant etudiant);
	
	Etudiant getEtudiant(Integer id);
	
	List<Etudiant> getListEtudiant();
}
