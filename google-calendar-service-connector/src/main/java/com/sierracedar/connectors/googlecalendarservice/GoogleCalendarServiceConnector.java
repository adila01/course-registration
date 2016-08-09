package com.sierracedar.connectors.googlecalendarservice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.OnException;
import org.mule.api.annotations.lifecycle.Start;

import com.google.api.services.calendar.model.CalendarList;
import com.google.api.services.calendar.model.CalendarListEntry;
import com.google.api.services.calendar.model.Events;
import com.sierracedar.connectors.googlecalendarservice.config.ConnectorConfig;
import com.sierracedar.connectors.googlecalendarservice.error.ErrorHandler;

@Connector(name="google-calendar-service", friendlyName="Google Calendar Service")
@MetaDataScope( DataSenseResolver.class )
@OnException(handler=ErrorHandler.class)
public class GoogleCalendarServiceConnector {

    @Config
    ConnectorConfig config;

    /**
     * Google Calendar Client
     */
    private com.google.api.services.calendar.Calendar client;
	

    /**
     * Initalize the Google Calendar Client
     * @throws URISyntaxException 
     */
    @Start
    public void init() throws IOException, GeneralSecurityException, URISyntaxException {
    	client = GoogleCalendarServiceClient.getCalendarService(config.getServiceAccountId());
	}
    
    /**
     * Return Calendar List
     *
     * @return Get a list of calendars
     * @throws IOException 
     */
    @Processor
    public List<CalendarListEntry> calendarList() throws IOException {
        CalendarList calendarList = client.calendarList().list().execute();
    	return calendarList.getItems();
    }

    /**
     * Return A Class
     * 
     * @param calenderId the calendar id of the subject
     * @return a class
     * @throws IOException 
     */
    @Processor
    public Map<String,Object> course(String calendarId) throws IOException {
        Events events = client.events().list(calendarId).setMaxResults(1).execute();
    	return events.getItems().get(0);
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}