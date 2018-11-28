package mr.gov.mesrstic.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "etudiant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiant implements Serializable{
	private static final long serialVersionUID = -2049223911358811352L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	private String nom;
	private String prenom;
	private String sexe;
	private int anneeBac;
	private int anneeInscription;
	private String numeroInscription;
	private String lieuNaissance;
	private Date dateNaissance;
	private String niveau;
	private String specialite;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAnneeBac() {
		return anneeBac;
	}

	public void setAnneeBac(int anneeBac) {
		this.anneeBac = anneeBac;
	}

	public int getAnneeInscription() {
		return anneeInscription;
	}

	public void setAnneeInscription(int anneeInscription) {
		this.anneeInscription = anneeInscription;
	}

	public String getNumeroInscription() {
		return numeroInscription;
	}

	public void setNumeroInscription(String numeroInscription) {
		this.numeroInscription = numeroInscription;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	
	
	
}
