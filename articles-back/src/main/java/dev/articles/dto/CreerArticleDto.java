package dev.articles.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreerArticleDto {

	/** libelle */
	@NotNull
	@NotBlank
	@Size(min = 5)
	@JsonProperty("libelle")
	private String libelle;

	/** prix */
	@NotNull
	@NotBlank
	@Positive
	@JsonProperty("prix")
	private Float prix;

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
	public Float getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix to set
	 */
	public void setPrix(Float prix) {
		this.prix = prix;
	}

}
