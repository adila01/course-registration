package com.sierracedar.searchcalendar.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Converts the string query into an object
 *    It makes the payload smaller by 
 *    ignoring some fields.
 * 
 * @author Adil Arif
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class AJAXRequest {

	private String firstname;
	private String lastname;
	private String telephone1;
	private String subject;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTelephone1() {
		return telephone1;
	}
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
