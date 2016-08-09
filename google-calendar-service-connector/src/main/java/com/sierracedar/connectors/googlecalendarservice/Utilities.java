package com.sierracedar.connectors.googlecalendarservice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class Utilities {
    public static File extractP12 (String resource) throws IOException {
    	InputStream stream = Utilities.class.getResourceAsStream(resource);
        final File tempFile = File.createTempFile("googlecalendar", ".p12");
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(stream, out);
        }
        return tempFile;
    }
}
