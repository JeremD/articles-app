package dev.articles.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreerArticleDto {

	/** libelle */
	@NotNull
	@JsonProperty("libelle")
	private String libelle;

	/** prix */
	@NotNull
	@JsonProperty("prix")
	private double prix;

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
