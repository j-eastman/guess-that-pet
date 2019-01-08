package models;

import java.io.File;

public class UserSubmission {
	public String email;
	public String petName;
	public String hint;
	public String species;
	public File file;
	public boolean receiveUpdates;
	
	public UserSubmission(String email, String petName, String hint, String species, File file, boolean receiveUpdates){
		this.email = email;
		this.petName = petName;
		this.hint = hint;
		this.species = species;
		this.file = file;
		this.receiveUpdates = receiveUpdates;
	}
}
