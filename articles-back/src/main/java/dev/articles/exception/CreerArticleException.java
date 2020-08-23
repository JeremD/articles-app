package dev.articles.exception;

import org.springframework.dao.DataIntegrityViolationException;

import dev.articles.dto.MessageErreurDto;

public class CreerArticleException extends DataIntegrityViolationException {

	private MessageErreurDto messageErreur;

	/**
	 * Constructor
	 * 
	 * @param msg
	 * @param cause
	 */
	public CreerArticleException(String messageErreur, Throwable cause) {
		super(messageErreur, cause);
	}

	/**
	 * Constructor
	 * 
	 * @param msg
	 */
	public CreerArticleException(String messageErreurDto) {
		super(messageErreurDto);
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
