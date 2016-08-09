package com.sierracedar.connectors.googlecalendarservice.error;

import org.mule.api.annotations.Handle;
import org.mule.api.annotations.components.Handler;

@Handler
public class ErrorHandler {

    @Handle
    public void handle(Exception ex) throws Exception {
    	ex.printStackTrace();
    }

}