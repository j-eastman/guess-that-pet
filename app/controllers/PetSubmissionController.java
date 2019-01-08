package controllers;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import models.UserSubmission;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.RawBuffer;
import play.mvc.Http.RequestBody;
import play.mvc.Result;
import views.formdata.UserSubmissionForm;

@Singleton
public class PetSubmissionController extends Controller {
	private final Form<UserSubmissionForm> form;
	
	
	@Inject
	public PetSubmissionController(FormFactory formFactory){
		UserSubmissionForm userData = new UserSubmissionForm();
		this.form = formFactory.form(UserSubmissionForm.class).fill(userData);
		//test = com.google.common.collect.Lists.newArrayList("this","is","the","list");
		
		
	}
	
	public Result index() {
		return ok(views.html.pet_submission.render(form));
	}

	@SuppressWarnings("deprecation")
	public Result upload() {
		final Form<UserSubmissionForm> boundForm = form.bindFromRequest();
		if (boundForm.hasErrors()){
			flash("Error","Please correct errors above.");
			return badRequest(views.html.pet_submission.render(form));
		} else {
			UserSubmission userSubmission = UserSubmission.makeInstance(boundForm.get());
			UserSubmissionForm user = boundForm.get();
			flash("success","User Submission: " + user);
			System.out.println(user.toString());
			return ok(views.html.pet_submission.render(boundForm));
		}
		/**System.out.println("Body:" + request().body().asText());
		Http.MultipartFormData<File> body = request().body().asMultipartFormData();
		RawBuffer buff = request().body().asRaw();
		Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");
		Http.MultipartFormData.FilePart<File> petname = body.getFile("petname");
		for (Http.MultipartFormData.FilePart<File> file : body.getFiles()) {
			if (file != null) {
				System.out.println("Filename: " + file.getFilename());
				System.out.println("Content Type: " + file.getContentType());
				System.out.println("File: " + file.getFile().toString());
				System.out.println("\n");
			}
		}
		if (picture != null) {
			String fileName = picture.getFilename();
			String contentType = picture.getContentType();
			File file = picture.getFile();

			return ok("File uploaded");
		} else {
			flash("error", "Missing file");
			return badRequest();
		}**/
	}
}
