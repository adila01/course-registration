package com.sierracedar.connectors.googlecalendarservice.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	/**
     * Service Account Id
     */
    @Configurable
    private String serviceAccountId;

    /**
     * Set Service Account Id
     *
     * @param serviceAccountId the service account id
     */
    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * Get Service Account Id
     */
    public String getServiceAccountId() {
        return this.serviceAccountId;
    }
}