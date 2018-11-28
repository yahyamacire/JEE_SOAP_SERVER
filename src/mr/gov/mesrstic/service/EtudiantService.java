package mr.gov.mesrstic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mr.gov.mesrstic.dao.IEtudiantDAO;
import mr.gov.mesrstic.model.Etudiant;

@Component
public class EtudiantService implements IEtudiantService {

	@Autowired
	private IEtudiantDAO etudiantDAO;
	
	@Override
	public void save(Etudiant etudiant) {
		etudiantDAO.save(etudiant);
	}
	
	@Override
	public Etudiant getEtudiant(Integer id) {
		return etudiantDAO.getEtudiant(id);
	}

	@Override
	public List<Etudiant> getListEtudiant() {
		return etudiantDAO.getListEtudiant();
	}

	public IEtudiantDAO getEtudiantDAO() {
		return etudiantDAO;
	}

	public void setEtudiantDAO(IEtudiantDAO etudiantDAO) {
		this.etudiantDAO = etudiantDAO;
	}

}
