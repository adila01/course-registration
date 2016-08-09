
package com.sierracedar.connectors.googlecalendarservice.generated.adapters;

import com.sierracedar.connectors.googlecalendarservice.GoogleCalendarServiceConnector;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GoogleCalendarServiceConnectorProcessAdapter</code> is a wrapper around {@link GoogleCalendarServiceConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.2", date = "2016-08-08T04:15:16-04:00", comments = "Build 3.8.x.2783.0c270ac")
public class GoogleCalendarServiceConnectorProcessAdapter
    extends GoogleCalendarServiceConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GoogleCalendarServiceConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GoogleCalendarServiceConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GoogleCalendarServiceConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GoogleCalendarServiceConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GoogleCalendarServiceConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GoogleCalendarServiceConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
