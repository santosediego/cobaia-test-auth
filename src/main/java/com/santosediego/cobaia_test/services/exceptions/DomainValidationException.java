package com.santosediego.cobaia_test.services.exceptions;

public class DomainValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainValidationException(String msg) {
		super(msg);
	}
}
