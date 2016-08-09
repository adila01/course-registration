package com.sierracedar.searchcalendar.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class CalendarResponse {

	private String name;
	private String start;
	private String end;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
}
