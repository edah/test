package com.glg.model.entity;

// Generated 26 d�c. 2013 11:40:42 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Societe generated by hbm2java
 */
@Entity
@Table(name = "SOCIETE")
public class Societe implements java.io.Serializable {

	private long idSociete;
	private Locataire locataire;
	private String sciSarl;
	private String numTva;
	private String profExerce;

	public Societe() {
	}

	public Societe(long idSociete, String sciSarl) {
		this.idSociete = idSociete;
		this.sciSarl = sciSarl;
	}

	public Societe(long idSociete, Locataire locataire, String sciSarl,
			String numTva, String profExerce) {
		this.idSociete = idSociete;
		this.locataire = locataire;
		this.sciSarl = sciSarl;
		this.numTva = numTva;
		this.profExerce = profExerce;
	}

	@Id
	@Column(name = "ID_SOCIETE", unique = true, nullable = false, precision = 12, scale = 0)
	public long getIdSociete() {
		return this.idSociete;
	}

	public void setIdSociete(long idSociete) {
		this.idSociete = idSociete;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_LOCATAIRE")
	public Locataire getLocataire() {
		return this.locataire;
	}

	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}

	@Column(name = "SCI_SARL", nullable = false, length = 144)
	public String getSciSarl() {
		return this.sciSarl;
	}

	public void setSciSarl(String sciSarl) {
		this.sciSarl = sciSarl;
	}

	@Column(name = "NUM_TVA", length = 144)
	public String getNumTva() {
		return this.numTva;
	}

	public void setNumTva(String numTva) {
		this.numTva = numTva;
	}

	@Column(name = "PROF_EXERCE", length = 80)
	public String getProfExerce() {
		return this.profExerce;
	}

	public void setProfExerce(String profExerce) {
		this.profExerce = profExerce;
	}

}
