package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

public class FirstController extends Controller{

	public Result index(String payload) {
		System.out.println("Message received: " + payload);
        return ok("You sent a get message: " + payload);
    }
	
    @BodyParser.Of(BodyParser.Json.class)
    public Result reply() {
    	JsonNode json = request().body().asJson();
    	System.out.println("JSON: " + json.toString());
    	String body = json.toString();
		System.out.println("Message received: " + body);
        return ok("You sent a POST message: " + body);
    }
}
