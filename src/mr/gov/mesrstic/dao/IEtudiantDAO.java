package mr.gov.mesrstic.dao;

import java.util.List;

import mr.gov.mesrstic.model.Etudiant;

public interface IEtudiantDAO {

	void save(Etudiant etudiant);
	
	Etudiant getEtudiant(Integer id);
	
	List<Etudiant> getListEtudiant();
}
