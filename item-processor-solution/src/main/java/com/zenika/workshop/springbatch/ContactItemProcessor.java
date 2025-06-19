/**
 * 
 */
package com.zenika.workshop.springbatch;

import org.springframework.batch.item.ItemProcessor;


public class ContactItemProcessor implements
		ItemProcessor<Contact, RegistrationConfirmation> {
	
	private RegistrationService registrationService;

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
	 */
	@Override
	public RegistrationConfirmation process(Contact item) throws Exception {
		return registrationService.process(item);
	}
	
	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

}
