package com.sierracedar.connectors.googlecalendarservice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;

public class GoogleCalendarServiceClient {

   /** Application name. */
   private static final String APPLICATION_NAME = "Google Calendar Service Connector";

   /** Global instance of the JSON factory. */
   private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    
   /** Global instance of the HTTP transport. */
   private static HttpTransport HTTP_TRANSPORT;
    
   /** Global instance of the scopes required by this quickstart. */
   private static final List<String> SCOPES = Arrays.asList(CalendarScopes.CALENDAR);

   static {
       try {
           HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
       } catch (Throwable t) {
           t.printStackTrace();
           System.exit(1);
       }
   }

   /**
    * Creates an authorized Credential object.
    * @return an authorized Credential object.
    * @throws IOException
    * @throws GeneralSecurityException 
 * @throws URISyntaxException 
    */
   public static Credential authorize(String serviceAccountId) throws IOException, GeneralSecurityException, URISyntaxException {
	   
    
       GoogleCredential credential = new GoogleCredential.Builder()
		    .setTransport(HTTP_TRANSPORT)
		    .setJsonFactory(JSON_FACTORY)
		    .setServiceAccountId(serviceAccountId)
		    .setServiceAccountPrivateKeyFromP12File(Utilities.extractP12("/googlecalendar.p12"))
		    .setServiceAccountScopes(SCOPES)
		    .build();
       
       return credential;
   }

   /**
    * Build and return an authorized Calendar client service.
    * @return an authorized Calendar client service
    * @throws IOException
 * @throws GeneralSecurityException 
 * @throws URISyntaxException 
    */
   public static Calendar getCalendarService(String serviceAccountId) throws IOException, GeneralSecurityException, URISyntaxException {  
       Credential credential = authorize(serviceAccountId);
       
       return new Calendar.Builder(
               HTTP_TRANSPORT, JSON_FACTORY, credential)
               .setApplicationName(APPLICATION_NAME)
               .build();
   }   
}
