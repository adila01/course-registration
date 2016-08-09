
package com.sierracedar.connectors.googlecalendarservice.generated.adapters;

import com.sierracedar.connectors.googlecalendarservice.GoogleCalendarServiceConnector;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import javax.annotation.Generated;
import org.mule.api.DefaultMuleException;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.common.MuleVersion;
import org.mule.config.MuleManifest;
import org.mule.config.i18n.CoreMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A <code>GoogleCalendarServiceConnectorLifecycleInjectionAdapter</code> is a wrapper around {@link GoogleCalendarServiceConnector } that adds lifecycle methods to the pojo. This adapter also allows the injection of several Mule facilities when a MuleContext is set.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.2", date = "2016-08-08T04:15:16-04:00", comments = "Build 3.8.x.2783.0c270ac")
public class GoogleCalendarServiceConnectorLifecycleInjectionAdapter
    extends GoogleCalendarServiceConnectorMetadataAdapter
    implements MuleContextAware, Disposable, Initialisable, Startable, Stoppable
{


    @Override
    public void start()
        throws MuleException
    {
        try {
            super.init();
        } catch (IOException e0) {
            throw new DefaultMuleException(e0);
        } catch (GeneralSecurityException e1) {
            throw new DefaultMuleException(e1);
        } catch (URISyntaxException e2) {
            throw new DefaultMuleException(e2);
        }
    }

    @Override
    public void stop()
        throws MuleException
    {
    }

    @Override
    public void initialise()
        throws InitialisationException
    {
        Logger log = LoggerFactory.getLogger(GoogleCalendarServiceConnectorLifecycleInjectionAdapter.class);
        MuleVersion connectorVersion = new MuleVersion("3.5.0");
        MuleVersion muleVersion = new MuleVersion(MuleManifest.getProductVersion());
        if (!muleVersion.atLeastBase(connectorVersion)) {
            throw new InitialisationException(CoreMessages.minMuleVersionNotMet(this.getMinMuleVersion()), this);
        }
    }

    @Override
    public void dispose() {
    }

    @Override
    public void setMuleContext(MuleContext context) {
    }

}
