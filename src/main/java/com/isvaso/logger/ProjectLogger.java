package com.isvaso.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class ProjectLogger {

    private Logger LOGGER;

    private ProjectLogger(String name) {
        this.LOGGER = Logger.getLogger(name);

        LogManager logManager = LogManager.getLogManager();

        Handler fileHandler = null;

        try {
            logManager.readConfiguration(
                    new FileInputStream(
                            "/Volumes/THB_HDD/Programming/" +
                                    "JAVA/Projects/" +
                                    "Lessons/Udemy_DesignPatternsInJava/" +
                                    "src/main/resources/logging.properties"));
        } catch (IOException e) {
            System.err.println("Can't load logging properties file");
        }

        try {
            fileHandler = new FileHandler();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.LOGGER.addHandler(fileHandler);

    }

    public static ProjectLogger getLogger(String name) {
        return new ProjectLogger(name);
    }

    public void log(Level level, String message) {
        LOGGER.log(level, message);
    }

    public void log(Level level, String message, Throwable throwable) {
        LOGGER.log(level, message, throwable);
    }
}

