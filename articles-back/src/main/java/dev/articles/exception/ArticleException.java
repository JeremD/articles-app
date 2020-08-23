package dev.articles.exception;

import dev.articles.dto.MessageErreurDto;

public class ArticleException extends RuntimeException {

	private MessageErreurDto messageErreur;

	/**
	 * Constructor
	 * 
	 */
	public ArticleException() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param messageErreur
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ArticleException(String messageErreur, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(messageErreur, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Constructor
	 * 
	 * @param messageErreur
	 * @param cause
	 */
	public ArticleException(String messageErreur, Throwable cause) {
		super(messageErreur, cause);
	}

	/**
	 * Constructor
	 * 
	 * @param messageErreur
	 */
	public ArticleException(String messageErreur) {
		super(messageErreur);
	}

	/**
	 * Constructor
	 * 
	 * @param cause
	 */
	public ArticleException(Throwable cause) {
		super(cause);
	}

	/**
	 * Getter
	 * 
	 * @return messageErreur
	 */
	public MessageErreurDto getMessageErreur() {
		return messageErreur;
	}

	/**
	 * Setter
	 * 
	 * @param messageErreur to set
	 */
	public void setMessageErreur(MessageErreurDto messageErreur) {
		this.messageErreur = messageErreur;
	}

}
