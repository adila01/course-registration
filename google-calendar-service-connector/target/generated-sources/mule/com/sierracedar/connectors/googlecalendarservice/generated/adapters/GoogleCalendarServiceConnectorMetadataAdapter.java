
package com.sierracedar.connectors.googlecalendarservice.generated.adapters;

import com.sierracedar.connectors.googlecalendarservice.GoogleCalendarServiceConnector;
import javax.annotation.Generated;
import org.mule.api.MetadataAware;


/**
 * A <code>GoogleCalendarServiceConnectorMetadataAdapter</code> is a wrapper around {@link GoogleCalendarServiceConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.2", date = "2016-08-08T04:15:16-04:00", comments = "Build 3.8.x.2783.0c270ac")
public class GoogleCalendarServiceConnectorMetadataAdapter
    extends GoogleCalendarServiceConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Google Calendar Service";
    private final static String MODULE_VERSION = "1.0.0";
    private final static String DEVKIT_VERSION = "3.8.2";
    private final static String DEVKIT_BUILD = "3.8.x.2783.0c270ac";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
