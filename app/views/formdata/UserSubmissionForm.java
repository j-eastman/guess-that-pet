package views.formdata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import play.data.validation.ValidationError;

public class UserSubmissionForm {
	public String email;
	public String petName;
	public String hint;
	public String species;
	public File file;
	public boolean receiveUpdates;

	public UserSubmissionForm() {
	}

	public UserSubmissionForm(String email, String petName, String hint, String species, File file,
			boolean receiveUpdates) {
		this.email = email;
		this.petName = petName;
		this.hint = hint;
		this.species = species;
		this.file = file;
		this.receiveUpdates = receiveUpdates;
	}

	public List<ValidationError> validate() {
		List<ValidationError> errors = new ArrayList<>();
		if (petName == null || petName.length() == 0) {
			errors.add(new ValidationError("petName", "No pet name was given."));
		}
		if (species == null || species.length() == 0) {
			errors.add(new ValidationError("species", "No species was given."));
		}

		if (errors.size() > 0) {
			return errors;
		}
		return null;

	}
}