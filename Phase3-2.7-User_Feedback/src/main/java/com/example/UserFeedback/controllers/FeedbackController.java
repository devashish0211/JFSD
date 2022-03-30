package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.repositories.FeedbackRepository;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@GetMapping(value="/")
    public String showIndexPage(ModelMap model){   
		 return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "		a {\n"
		 		+ "	  		text-decoration: None;\n"
		 		+ "	  		color:black;\n"
		 		+ "	  	}\n"
		 		+ "		#comment, #rating, #name {\n"
		 		+ "	  		padding: 16px;\n"
		 		+ "	  		margin:4px;\n"
		 		+ "	  		border-radius:4px;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body>\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
		 		
		 		+ "		\n"
		 		+ "		<br><br>\n"
				+ "     <form method=\"get\" action=\"update\">\n "
				+ " 	<fieldset>"
				+ "			<br><h3>Enter your feedback below:</h3>\n"
				+ "			<label for=\"name\">Enter Your Name:</label>"
				+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter UserName Here...\" required> "
				+ "         <label for=\"name\">Give Your Rating:</label>"                                     
				+ "			<input type=\"number\" id=\"rating\" name=\"rating\"  min=\"1\" max=\"10\" placeholder=\"Rating\" required>"
				+ "			<label for=\"name\">Any Comments:</label>"
				+ "			<input type=\"textbox\" id=\"comment\" name=\"comment\" placeholder=\"Enter Comment Here...\" required>\n <br><br>"
				+ "			<input type=\"submit\" value=\"Submit\" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n"
				
				+ "		</fieldset>"
				+ "		</form>"
				+ "         <button><a href=\"/feedback\">View all feedback</a></button>\n"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	
	@GetMapping("/feedback")
	public @ResponseBody String getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        Iterable<Feedback> allFB = feedbackRepository.findAll();
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  		align-items: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body >\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "<h1>Feedback Table</h1>\n"
//		 		+ "<table border='1'>"+"<tr><th>"+"UserName"+"</th>"+"<tr><th>"+"Id"+"</th>"+"<tr><th>"+"Comments"+"</th>"+"<tr><th>"+"Rating"+"</th></tr>"
        		+ allFB.toString()
		        + "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	

}
