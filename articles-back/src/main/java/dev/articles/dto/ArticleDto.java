package dev.articles.dto;

import org.springframework.data.annotation.Id;

public class ArticleDto {

	/** id */
	@Id
	private Integer id;

	/** libelle */
	private String libelle;

	/** prix */
	private Float prix;

	/**
	 * Constructor
	 * 
	 */
	public ArticleDto() {
	}

	/**
	 * Constructor
	 * 
	 * @param libelle
	 * @param prix
	 */
	public ArticleDto(Integer id, String libelle, Float prix) {
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
	}

	/**
	 * Getter
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id to set
	 */
	public void setId(int id) {
		this.id = id;
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
