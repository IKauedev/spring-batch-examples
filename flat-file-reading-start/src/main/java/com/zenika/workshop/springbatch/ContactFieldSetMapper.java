/**
 * 
 */
package com.zenika.workshop.springbatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class ContactFieldSetMapper implements FieldSetMapper<Contact> {


	@Override
	public Contact mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO 02 create a Contact from the FieldSet
		return null;
	}
}
