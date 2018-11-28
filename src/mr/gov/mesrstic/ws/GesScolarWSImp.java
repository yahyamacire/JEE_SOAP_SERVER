package mr.gov.mesrstic.ws;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import mr.gov.mesrstic.model.Etudiant;
import mr.gov.mesrstic.service.IEtudiantService;

@Service
@WebService(endpointInterface = "mr.gov.mesrstic.ws.GesScolarWS")
public class GesScolarWSImp extends SpringBeanAutowiringSupport implements GesScolarWS{

	@Autowired
	private IEtudiantService etudiantService;
	
	@Autowired
	private SessionFactory sessionFactory;

	@PostConstruct
	@WebMethod(exclude = true)
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}

	@Override
	@Transactional
	public List<Etudiant> getEtudiants() {
		init();
	    
		List<Etudiant> etudiants = new ArrayList<>();
		
		for(Etudiant e : etudiantService.getListEtudiant()) {
			etudiants.add(e);
		}
		return etudiants;
	}

	
	public IEtudiantService getEtudiantService() {
		return etudiantService;
	}

	public void setEtudiantService(IEtudiantService etudiantService) {
		this.etudiantService = etudiantService;
		System.out.println("IEtudiantService was inistilised " + etudiantService);
	}

	@Autowired(required = true)
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

	
}