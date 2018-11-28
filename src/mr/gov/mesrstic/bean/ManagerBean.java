package mr.gov.mesrstic.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import mr.gov.mesrstic.model.Etudiant;
import mr.gov.mesrstic.service.IEtudiantService;

@ManagedBean(name = "managerBean")
@SessionScoped
@Scope
@Component
public class ManagerBean {

	@Autowired
	private IEtudiantService etudiantService;

	private Etudiant etudiant;
	private List<Etudiant> etudiants;
	
	private int nbCopie = 1;

	@PostConstruct
	public void init() {
		etudiant = new Etudiant();
		etudiants = new ArrayList<>();
		
		listerEtudiant();
	}

	public String ajouterEtudiant() {
		etudiant = new Etudiant();
		return "HOME";
	}

	public String enregistrerEtudiant() {
		
		for(int i = 1; i<= nbCopie ; i++) {
			etudiant.setId(null);
			etudiantService.save(etudiant);
		}
		etudiant = new Etudiant();
		
		FacesMessage facesMessage = new FacesMessage();		
		facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
		facesMessage.setSummary(nbCopie + " Etudiant(s) ajouté(s)" );
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, facesMessage);
		
		return listerEtudiant();
	}

	public String listerEtudiant() {
		etudiants = etudiantService.getListEtudiant();

		return "HOME";
	}

	public IEtudiantService getEtudiantService() {
		return etudiantService;
	}

	public void setEtudiantService(IEtudiantService etudiantService) {
		this.etudiantService = etudiantService;
		
		System.out.println("ManagerBean: etudiantService bean instantiated!");
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public int getNbCopie() {
		return nbCopie;
	}

	public void setNbCopie(int nbCopie) {
		this.nbCopie = nbCopie;
	}


}
