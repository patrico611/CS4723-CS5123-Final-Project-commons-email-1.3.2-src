package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class Test2 extends TestCase{
	Email testEmail;
	System.out.println("This checks that the Add BCC works correctly.  ID: auv298");
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCc() throws EmailException {
		System.out.println("This is a message from the second test.");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}

}