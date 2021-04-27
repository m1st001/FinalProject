package com.epam.web.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Loader {

    public Properties loadProperties(String filename) throws IOException {

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename)) {

            if (inputStream == null) {
                throw new IOException("File not found");
            }

            Properties properties = new Properties();
            properties.load(inputStream);

            return properties;
        }
    }
}