package mr.gov.mesrstic.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import mr.gov.mesrstic.model.Etudiant;

@Component
@Transactional
public class EtudiantDAO implements IEtudiantDAO, Serializable {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Etudiant etudiant) {
		 sessionFactory.getCurrentSession().saveOrUpdate(etudiant);
	}
	
	
	@Override
	public Etudiant getEtudiant(Integer id) {
		return (Etudiant) sessionFactory.getCurrentSession().get(Etudiant.class, id);
	}

	@Override
	public List<Etudiant> getListEtudiant() {
		return sessionFactory.getCurrentSession().createQuery("from Etudiant").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

}
