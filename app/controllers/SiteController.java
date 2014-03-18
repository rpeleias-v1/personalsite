package controllers;

import play.*;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;

public class SiteController extends Controller{
	
	public static Result index() {
		return ok(views.html.index.render(Messages.get("global.fullName")));
	}
	
	public static Result experience() {
		return ok(views.html.experience.render(Messages.get("global.experience")));
	}
	
	public static Result technologies() {
		return ok(views.html.technologies.render(Messages.get("global.technologies")));
	}
	
	public static Result certifications() {
		return ok(views.html.certifications.render(Messages.get("global.certifications")));
	}
	
	public static Result scholarship() {
		return ok(views.html.certifications.render(Messages.get("global.scholarship")));
	}
	
	public static Result languages() {
		return ok(views.html.languages.render(Messages.get("global.languages")));
	}
	
	public static Result contact() {
		return ok(views.html.contact.render(Messages.get("global.contact")));
	}

}
