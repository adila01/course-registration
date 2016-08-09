
package com.sierracedar.connectors.googlecalendarservice.generated.adapters;

import com.sierracedar.connectors.googlecalendarservice.GoogleCalendarServiceConnector;
import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>GoogleCalendarServiceConnectorCapabilitiesAdapter</code> is a wrapper around {@link GoogleCalendarServiceConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.2", date = "2016-08-08T04:15:16-04:00", comments = "Build 3.8.x.2783.0c270ac")
public class GoogleCalendarServiceConnectorCapabilitiesAdapter
    extends GoogleCalendarServiceConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
