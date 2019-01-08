package forms;

import java.io.File;

public class UserSubmissionForm {
	String email;
	String petName;
	String hint;
	String species;
	File file;
	boolean receiveUpdates;

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

	public boolean isReceiveUpdates() {
		return receiveUpdates;
	}

	public void setReceiveUpdates(boolean receiveUpdates) {
		this.receiveUpdates = receiveUpdates;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;

	}
	
	public String toString(){
		try {
			System.out.println("File: " + file.toString());
		} catch(Exception e){}
		return String.format("PetName: %s\nSpecies: %s\nHint: %s\nEmail: %s\nReceive Updates: %b\n\n", petName,species,hint,email,receiveUpdates);
	}

}
