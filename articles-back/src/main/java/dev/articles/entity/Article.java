package dev.articles.entity;

import javax.persistence.Entity;

@Entity
public class Article {

	/** libelle */
	private String libelle;

	/** prix */
	private double prix;

	/**
	 * Constructor
	 * 
	 */
	public Article() {
	}

	/**
	 * Constructor
	 * 
	 * @param libelle
	 * @param prix
	 */
	public Article(String libelle, double prix) {
		this.libelle = libelle;
		this.prix = prix;
	}

	/**
	 * Getter
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
