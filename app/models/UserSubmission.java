package models;

import java.io.File;

import views.formdata.UserSubmissionForm;

public class UserSubmission {
	private String email;
	private String petName;
	private String hint;
	private String species;
	private File file;
	private boolean receiveUpdates;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public boolean isReceiveUpdates() {
		return receiveUpdates;
	}

	public void setReceiveUpdates(boolean receiveUpdates) {
		this.receiveUpdates = receiveUpdates;
	}

	public UserSubmission(){}
	
	public UserSubmission(String email, String petName, String hint, String species, File file, boolean receiveUpdates){
		this.email = email;
		this.petName = petName;
		this.hint = hint;
		this.species = species;
		this.file = file;
		this.receiveUpdates = receiveUpdates;
	}
	
	public static UserSubmission makeInstance(UserSubmissionForm formData){
		return new UserSubmission(formData.email, formData.petName, formData.hint, formData.species, formData.file, formData.receiveUpdates);
	}
	
	@Override
	public String toString(){
		try {
			System.out.println("File: " + file.toString());
		} catch(Exception e){}
		return String.format("PetName: %s\nSpecies: %s\nHint: %s\nEmail: %s\nReceive Updates: %b\n\n", petName,species,hint,email,receiveUpdates);
	}
}
