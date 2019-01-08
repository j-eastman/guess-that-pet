package controllers;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import forms.UserSubmissionForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.RawBuffer;
import play.mvc.Http.RequestBody;
import play.mvc.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class PetSubmissionController extends Controller {
	private final Form<UserSubmissionForm> form;
	//private final List<String> test;
	
	
	@Inject
	public PetSubmissionController(FormFactory formFactory){
		this.form = formFactory.form(UserSubmissionForm.class);
		//test = com.google.common.collect.Lists.newArrayList("this","is","the","list");
		
		
	}
	
	public Result index() {
		return ok(views.html.pet_submission.render());
	}

	@SuppressWarnings("deprecation")
	public Result upload() {
		final Form<UserSubmissionForm> boundForm = form.bindFromRequest();
		if (boundForm.hasErrors()){
			play.Logger.ALogger logger = play.Logger.of(getClass());		
			logger.error("errors = {}",boundForm.errors());	
			return badRequest("error");
		} else {
			UserSubmissionForm user = boundForm.get();
			System.out.println(user.toString());
			return ok(user.toString());
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
