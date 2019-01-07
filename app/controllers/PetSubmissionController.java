package controllers;

import java.io.File;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class PetSubmissionController extends Controller {

	public Result index() {
		return ok(views.html.pet_submission.render());
	}

	public Result upload() {
		Http.MultipartFormData<File> body = request().body().asMultipartFormData();
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
		}
	}
}
