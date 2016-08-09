
package com.sierracedar.connectors.googlecalendarservice.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/google-calendar-service</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.2", date = "2016-08-08T04:15:16-04:00", comments = "Build 3.8.x.2783.0c270ac")
public class GoogleCalendarServiceNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(GoogleCalendarServiceNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [google-calendar-service] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [google-calendar-service] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new GoogleCalendarServiceConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("calendar-list", new CalendarListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("calendar-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("course", new CourseDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("course", "@Processor", ex);
        }
    }

}
