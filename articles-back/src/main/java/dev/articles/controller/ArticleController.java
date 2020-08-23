package dev.articles.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.articles.dto.ArticleDto;
import dev.articles.dto.CodeErreur;
import dev.articles.dto.CreerArticleDto;
import dev.articles.dto.MessageErreurDto;
import dev.articles.entity.Article;
import dev.articles.exception.ArticleException;
import dev.articles.exception.CreerArticleException;
import dev.articles.service.ArticleService;

@RestController
@RequestMapping
public class ArticleController {

	protected ArticleService articleService;

	/**
	 * Constructor
	 * 
	 * @param articleService
	 */
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	/**
	 * Lister tous les articles
	 * 
	 * @return
	 */
	@GetMapping("/articles")
	public ResponseEntity<?> listerArticles() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(articleService.lister());
	}

	/**
	 * Créer un article
	 * 
	 * @param article
	 * @param result
	 * @return
	 */
	@PostMapping("/articles")
	public ResponseEntity<?> creerArticle(@Valid @RequestBody CreerArticleDto article, BindingResult result) {

		if (result.hasErrors()) {
			return ResponseEntity.badRequest().body(new MessageErreurDto(CodeErreur.CREATION, "L'article créé est incorrecte !"));
		}

		Article nouvelArticle = articleService.creer(article.getLibelle(), article.getPrix());
		ArticleDto articleDto = new ArticleDto(nouvelArticle.getId(), nouvelArticle.getLibelle(),
				nouvelArticle.getPrix());
		
		return ResponseEntity.ok(articleDto);
	}
	

}
