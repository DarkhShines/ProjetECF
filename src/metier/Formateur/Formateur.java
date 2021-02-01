package metier.Formateur;

import java.time.LocalDate;

public class Formateur {
	String nom;
	String prenom;
	LocalDate naiss;
	
	public Formateur(String nom, String prenom, LocalDate naiss){
		this.nom = nom;
		this.prenom = prenom;
		this.naiss = naiss;
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

	public LocalDate getNaiss() {
		return naiss;
	}

	public void setNaiss(LocalDate naiss) {
		this.naiss = naiss;
	}
	
}
