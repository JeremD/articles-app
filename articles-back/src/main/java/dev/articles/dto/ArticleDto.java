package dev.articles.dto;

public class ArticleDto {

	/** id */
	private int id;

	/** libelle */
	private String libelle;

	/** prix */
	private double prix;

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
	public ArticleDto(String libelle, double prix) {
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
