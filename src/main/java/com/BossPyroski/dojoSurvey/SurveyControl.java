package com.BossPyroski.dojoSurvey;

//import java.net.http.HttpResponse;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyControl {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}

	@RequestMapping("/form")
	public String code() {

		return "form.jsp";
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String formSubmit(HttpSession session, @RequestParam(value = "name") String name,
			@RequestParam(value = "dojo") String dojo, @RequestParam(value = "language") String language,
			@RequestParam(value = "comment") String comment) {
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/form";
	}

}

////...
//@RequestMapping(value="/login", method=RequestMethod.POST)
//public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
////...

//@RequestMapping(value="survey", method=RequestMethod.POST)
//public String Survey(HttpSession session, @RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="Language") String Language, @RequestParam(value="comment") String comment) {
//	session.setAttribute("name", name);
//	session.setAttribute("location", location);
//	session.setAttribute("Language", Language);
//	session.setAttribute("comment", comment);
//	if(Language.equals("java")) {
//		return "redirect:/java";
//	}
//	else {
//		return "redirect:/Result";
//	}
//	
//}
