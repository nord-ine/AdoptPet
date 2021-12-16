package main;

public class MyAssociationException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyAssociationException() {
		super();
	}
	
	public String getMessage() {
		return "Weapon has already a God";
	}
}
