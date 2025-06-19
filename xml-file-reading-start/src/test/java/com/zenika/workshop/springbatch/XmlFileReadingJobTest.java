/**
 * 
 */
package com.zenika.workshop.springbatch;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/xml-file-reading-job.xml")
//TODO 03 remove the @Ignore annotation on the test
@Ignore
public class XmlFileReadingJobTest {

	@Autowired
	private Job job;
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Before public void setUp() {
		jdbcTemplate.update("delete from contact");
	}
	
	@Test public void xmlFileReading() throws Exception {
		// TODO 04 run the job with the job launcher. Use empty job parameters
		
		// TODO 05 check the returned JobExecution
		// it should have an ExitStatus.COMPLETED exit status
		
		// TODO 06 use the JdbcTemplate to check the content of the database.
		// take a look at the src/main/resources/contacts.xml 
		// to see how many contacts should be in the contact table.
		// hint: use the queryForInt method
		
		// TODO 07 run the test!
	}
	
}
