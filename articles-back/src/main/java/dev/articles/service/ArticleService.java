package dev.articles.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.articles.entity.Article;
import dev.articles.repository.ArticleRepository;

@Service
public class ArticleService {

	private ArticleRepository articleRepository;

	/**
	 * Constructor
	 * 
	 * @param articleRepository
	 */
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	/**
	 * Lister tous les articles
	 * 
	 * @return
	 */
	public List<Article> lister() {
		return articleRepository.findAll();
	}

	/**
	 * Créer un article
	 * 
	 * @param libelle
	 * @param prix
	 * @return
	 */
	@Transactional
	public Article creer(String libelle, Float prix) {
		return articleRepository.save(new Article(libelle, prix));
	}

}
