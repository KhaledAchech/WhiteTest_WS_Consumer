package de.tekup.DS.invoke.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.tekup.DS.invoke.client.SoapClient;
import de.tekup.DS.soap.api.consume.whitetests.StudentRequest;
import de.tekup.DS.soap.api.consume.whitetests.WhiteTestResponse;

@Controller
public class CheckWhiteTestsController {
	
	@Autowired
	private SoapClient client;
	
	@GetMapping("/check/student")
	public String checkForm(Model model) {
		StudentRequest request = new StudentRequest();
		model.addAttribute("request", request);
		return "request";
	}

	@PostMapping("/check/student")
	public String WhiteTests(@ModelAttribute("request") StudentRequest request,
			Model model) {
		WhiteTestResponse response = client.getWhiteTestDetails(request);
		model.addAttribute("response",response);
		return "response";
	}
}
