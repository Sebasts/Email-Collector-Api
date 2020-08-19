package io.hellsing.email.collector.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hellsing.email.collector.api.json.Contacts;
import io.hellsing.email.collector.api.service.ContactService;



@RestController
@RequestMapping("api")
public class ContactController {
	
	@Autowired
	public ContactService contactService; 
	

	@PostMapping("/create")
	private Contacts createContact(@RequestBody Contacts contact) {
		
		return this.contactService.save(contact);
	}
}
