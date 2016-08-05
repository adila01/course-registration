package org.mule.modules.googlecalendarimpersonate;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.Source;
import org.mule.api.annotations.SourceStrategy;
import org.mule.api.callback.SourceCallback;
import org.mule.api.annotations.lifecycle.OnException;
import org.mule.api.annotations.param.Default;

import org.mule.modules.googlecalendarimpersonate.config.ConnectorConfig;
import org.mule.modules.googlecalendarimpersonate.error.ErrorHandler;

import com.google.api.services.calendar.Calendar.CalendarList.List;
import com.google.api.services.calendar.model.CalendarList;

@Connector(name="google-calendar-impersonate", friendlyName="GoogleCalendarImpersonate")
@MetaDataScope( DataSenseResolver.class )
@OnException(handler=ErrorHandler.class)
public class GoogleCalendarImpersonateConnector {

	private com.google.api.services.calendar.Calendar client;
	
    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @return Get a list of calendars
     * @throws IOException 
     * @throws GeneralSecurityException 
     */
    @Processor
    public List getCalendars() throws IOException, GeneralSecurityException
    {
    	if (client == null)
    		client = GoogleCalClient.getCalendarService();
    	
    	return client.calendarList().list();
    }
    
    /**
     * DataSense processor

     * @param key Key to be used to populate the entity
     * @param entity Map that represents the entity
     * @return Some string
     */
    @Processor
    public Map<String,Object> addEntity( @MetaDataKeyParam String key, @Default("#[payload]") Map<String,Object> entity) {
        /*
         * USE THE KEY AND THE MAP TO DO SOMETHING
         */
        return entity;
    }

    /**
     *  Custom Message Source
     *
     *  @param callback The sourcecallback used to dispatch message to the flow
     *  @throws Exception error produced while processing the payload
     */
    @Source(sourceStrategy = SourceStrategy.POLLING,pollingPeriod=5000)
    public void getNewMessages(SourceCallback callback) throws Exception {
        /*
         * Every 5 the flow using this processor will be called and the payload will be the one defined here.
         * 
         * The PAYLOAD can be anything. In this example a String is used.  
         */
        callback.process("Start working");
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}