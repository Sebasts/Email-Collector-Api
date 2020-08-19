package io.hellsing.email.collector.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hellsing.email.collector.api.converter.ContactToContactConverter;
import io.hellsing.email.collector.api.json.Contacts;
import io.hellsing.email.jpa.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	@Autowired
	private ContactToContactConverter contactConverter;
	
	public Contacts save(Contacts contact) {
		io.hellsing.email.jpa.model.Contact result = this.contactRepo.save(this.contactConverter.convert(contact));
		
		if(result != null) {
			return this.contactConverter.convert(result);
		}
		
		return null;
	}
	

}
