package model.exceptions;

public class DomainExpections extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainExpections (String msg) {
		super(msg);
	}
}
