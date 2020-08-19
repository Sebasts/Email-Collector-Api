package io.hellsing.email.collector.api.converter;

import org.springframework.stereotype.Component;

import io.hellsing.email.collector.api.json.Contacts;

@Component
public class ContactToContactConverter {

	public Contacts convert(io.hellsing.email.jpa.model.Contact contact) {
		return new Contacts(contact.getCont_fst_nm(), contact.getCont_lst_nm(), contact.getCont_eml_adr(), contact.getCont_zip_cde());
	}
	
	public io.hellsing.email.jpa.model.Contact convert(Contacts contact) {
		return new io.hellsing.email.jpa.model.Contact(contact.getFirstName(), contact.getLastName(), contact.getEmailAddress(), contact.getZipCode());
	}
}
